package com.hairboard.springboot.backend.apirest.models.services;

import com.hairboard.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
