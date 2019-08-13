package com.utng.integradora.dao;

import java.util.List;

import com.utng.integradora.entity.Usuario;

public interface IUsuarioDao extends IGenericDao<Usuario, String> {

	List<Usuario> IsUsuario (String username,String contrasena);
	
}
