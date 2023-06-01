package com.example.hairboard.models.services;

import com.example.hairboard.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
