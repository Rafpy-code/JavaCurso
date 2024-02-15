package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.ClienteDaoInterface;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;


@Service
public class ClienteServiceImplements  implements ClienteServiceInterface{

	@Autowired
	private ClienteDaoInterface clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {	
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(long id) {	
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(long id) {
		clienteDao.deleteById(id);
	}

}
