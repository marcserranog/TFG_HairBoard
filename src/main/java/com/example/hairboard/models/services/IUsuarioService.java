package com.example.hairboard.models.services;

import com.example.hairboard.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
