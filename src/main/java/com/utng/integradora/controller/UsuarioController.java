package com.utng.integradora.controller;
import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.utng.integradora.entity.Usuario;
import com.utng.integradora.service.IUsuarioService;



/**
 * 	Descripcion:	Maneja peticiones de pantalla de Login.
 * 	Autor:	Leonardo Daniel Ramirez Reyes.
 * 	Fecha:	19 de junio del 2019
 */
@Controller
public class UsuarioController {

	private static final Logger logger =LoggerFactory.getLogger(UsuarioController.class);
	@Autowired
	private IUsuarioService usuarioService;
	
	
	 @RequestMapping(value = {"/","/inicio"}, method = RequestMethod.GET)
	  public String showinicio(Model model, Usuario usuario) {
		  
		  
		  return "inicio";
	  }
	 

		/**
		 * Simplemente selecciona la pantalla de home
		 */
	 //Método que solo muestra la pantalla 
	 @RequestMapping(value = "/loginUs" , method = RequestMethod.POST)
	  public @ResponseBody String loginUs(@RequestBody Usuario usuario) {
		  
		 List<Usuario> usuarios = usuarioService.isUsuario(usuario.getUsername(), usuario.getContrasena());
		 String msg ="";
		 if(usuarios.size() > 0) {
			 msg ="{\"msg\":\"success\"}";
		 }
		 else{
			 msg ="{\"msg\":\"fail\"}";
		 }
		
		  return msg;
	  }
      
	 @RequestMapping(value = "/regUs" , method=RequestMethod.POST)
	 public @ResponseBody String regUs(@RequestBody Usuario usuario) {
		 
		 usuarioService.saveOrUpdate(usuario);
		 return "{\"msg\":\"success\"}";
	 }
	
	 
	
	  @RequestMapping(value = "/productos", method = RequestMethod.GET)
	  public String showproductos(Model model) {
		  
		  
		 
		  return "productos";
	  }
	  
	  @RequestMapping(value = "/contacto", method = RequestMethod.GET)
	  public String showcontacto(Model model) {
		  
		 
		 
		  return "contacto";
	  }
      
	  @RequestMapping(value = "/recargas", method = RequestMethod.GET)
	  public String showrecargas(Model model) {
		  
		 
		 
		  return "recargas";
	  }
	  
	  @RequestMapping(value = "/impresion", method = RequestMethod.GET)
	  public String showimpresion(Model model) {
		  
		 
		 
		  return "impresion";
	  }

}
