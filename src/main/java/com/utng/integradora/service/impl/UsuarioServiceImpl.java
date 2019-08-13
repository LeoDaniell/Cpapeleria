package com.utng.integradora.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.utng.integradora.dao.IGenericDao;
import com.utng.integradora.dao.IUsuarioDao;
import com.utng.integradora.entity.Usuario;
import com.utng.integradora.service.GenericService;
import com.utng.integradora.service.IUsuarioService;
@Service
public class UsuarioServiceImpl extends GenericService<Usuario, String> implements IUsuarioService {

	private IUsuarioDao usuarioDao;
	
	public UsuarioServiceImpl() {
		super();
	}
    
	@Autowired
	public UsuarioServiceImpl(@Qualifier("usuarioDaoImpl")IGenericDao<Usuario, String> genericDao) {
		super(genericDao);
		this.usuarioDao=(IUsuarioDao) genericDao;
	}


	@Override
	public List<Usuario> isUsuario(String username, String contrasena) {
		
		return usuarioDao.IsUsuario(username, contrasena);
	}

	

}
