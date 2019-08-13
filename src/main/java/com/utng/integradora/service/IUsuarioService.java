package com.utng.integradora.service;

import java.util.List;

import com.utng.integradora.entity.Usuario;

public interface IUsuarioService extends IGenericService<Usuario, String> {

	List<Usuario> isUsuario (String username,String contrasena);
}
