package com.example.hairboard.controllers;

import com.example.hairboard.models.entity.Cliente;
import com.example.hairboard.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }
    @GetMapping("/clientes/create")
    public List<Cliente> create(){
        return clienteService.findAll();
    }
}
