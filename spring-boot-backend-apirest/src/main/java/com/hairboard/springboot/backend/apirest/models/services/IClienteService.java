package com.hairboard.springboot.backend.apirest.models.services;

import java.util.List;

import com.hairboard.springboot.backend.apirest.models.entity.Cliente;
import com.hairboard.springboot.backend.apirest.models.entity.Factura;
import com.hairboard.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hairboard.springboot.backend.apirest.models.entity.Producto;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
	
	public Factura findFacturaById(Long id);
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);
	
	public List<Producto> findProductoByNombre(String term);

}
