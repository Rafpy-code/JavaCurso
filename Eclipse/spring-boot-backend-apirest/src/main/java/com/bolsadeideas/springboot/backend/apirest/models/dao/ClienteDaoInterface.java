package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

													//Genérico, llave de la tabla.
public interface ClienteDaoInterface extends CrudRepository<Cliente, Long> {

}
