package com.example.hairboard.controllers;

import com.example.hairboard.models.entity.Company;
import com.example.hairboard.models.services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CompanyRestController {
    @Autowired
    private ICompanyService companyService;

    @GetMapping("/companies")
    public List<Company> index() {
        return companyService.findAll();
    }

    @GetMapping("/companies/page/{page}")
    public Page<Company> index(@PathVariable Integer page) {
        Pageable pageable = PageRequest.of(page, 4);
        return companyService.findAll(pageable);
    }

    @GetMapping("/companies/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Company company = null;
        Map<String, Object> response = new HashMap<>();

        try {
            company = companyService.findById(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (company == null) {
            response.put("mensaje", "La compañía con ID: ".concat(id.toString().concat(" no existe en la base de datos.")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Company>(company, HttpStatus.OK);
    }

    @PostMapping("/companies")
    public ResponseEntity<?> create(@Valid @RequestBody Company company, BindingResult result) {
        Company companyNew = null;
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo " + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        try {
            companyNew = companyService.save(company);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "La compañía ha sido creada con éxito!");
        response.put("company", companyNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @PutMapping("/companies/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Company company, BindingResult result, @PathVariable Long id) {
        Company companyActual = companyService.findById(id);
        Company companyUpdated = null;

        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo " + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        if (companyActual == null) {
            response.put("mensaje", "Error: no se pudo editar, la compañía con ID: ".concat(id.toString().concat(" no existe en la base de datos.")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        try {
            companyActual.setCompanyName(company.getCompanyName());
            companyActual.setEmail(company.getEmail());
            companyActual.setPhoneNumber(company.getPhoneNumber());
            //companyActual.setCreateAt(company.getCreateAt());

            companyUpdated = companyService.save(companyActual);

        } catch (DataAccessException e) {
            response.put("mensaje", "Error al actualizar la compañía en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "La compañía ha sido actualizada con éxito!");
        response.put("company", companyUpdated);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

    @DeleteMapping("/companies/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            companyService.delete(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al eliminar la compañía de la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "La compañía ha sido eliminada con éxito!");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

    @PostMapping("/companies/upload")
    public ResponseEntity<?> upload(@RequestParam("archivo") MultipartFile archivo, @RequestParam("id") Long id) {
        Map<String, Object> response = new HashMap<>();

        Company company = companyService.findById(id);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

    }

}
