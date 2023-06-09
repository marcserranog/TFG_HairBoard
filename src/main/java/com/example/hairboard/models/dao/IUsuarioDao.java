package com.example.hairboard.models.dao;

import com.example.hairboard.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username); // seria una select en la base de datos con la condicion where
	
	@Query("select u from Usuario u where u.username=?1") // select al objeto usuario donde el parametro es igual a el primer parametro
	public Usuario findByUsername2(String username);

}
