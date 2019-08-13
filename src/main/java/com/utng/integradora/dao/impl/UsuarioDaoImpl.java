package com.utng.integradora.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.utng.integradora.dao.GenericDao;
import com.utng.integradora.dao.IUsuarioDao;
import com.utng.integradora.entity.Usuario;


@Repository
@Transactional
public class UsuarioDaoImpl extends GenericDao<Usuario, String> implements IUsuarioDao {

	@Override
	public List<Usuario> IsUsuario(String username, String contrasena) {
			
		String sql = "from Usuario c where c.username= '" +username +"' and  c.contrasena='" + contrasena + "'";
		
		Query<Usuario> query= currentSession().createQuery(sql);
		
		
		return query.getResultList();
	}

	
}
