package com.utng.integradora.controller;






import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






/**
 * 	Descripcion:	Maneja peticiones de pantalla de Login.
 * 	Autor:	Leonardo Daniel Ramirez Reyes.
 * 	Fecha:	19 de junio del 2019
 */
@Controller
public class UsuarioController {

	
	
	
	/**
	 * Simplemente selecciona la pantalla de home
	 */
	
	 @RequestMapping(value = {"/","/inicio"}, method = RequestMethod.GET)
	  public String showinicio(Model model) {
		  
		  
		  return "inicio";
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
