package com.example.hairboard.controllers;

import com.example.hairboard.models.entity.Cliente;
import com.example.hairboard.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:49400"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }
    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable Long id){
        return clienteService.findById(id);
    }
    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id){
        Cliente clienteActual = clienteService.findById(id);

        clienteActual.setLastName(cliente.getLastName());
        clienteActual.setFirstName(cliente.getFirstName());
        clienteActual.setPhoneNumber(cliente.getPhoneNumber());
        clienteActual.setEmail(cliente.getEmail());

        return clienteService.save(clienteActual);
    }
    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }

}
