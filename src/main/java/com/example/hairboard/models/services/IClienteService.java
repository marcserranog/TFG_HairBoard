package com.example.hairboard.models.services;

import com.example.hairboard.models.entity.Cliente;
import com.example.hairboard.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);
    public List<Region> findAllRegiones();

}
