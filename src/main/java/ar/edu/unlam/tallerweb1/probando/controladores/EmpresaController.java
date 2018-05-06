package ar.edu.unlam.tallerweb1.probando.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ar.edu.unlam.tallerweb1.probando.modelo.Empleado;

@Controller
public class EmpresaController {

	@RequestMapping(path = "/saludar", method = RequestMethod.GET)
	public ModelAndView irASaludar() {
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Melanie");
		empleado.setDni(12345678);
		
		ModelMap  miModelo = new ModelMap();
		miModelo.put("empleado", empleado); // (clave unica , objeto q cree)
		
		return new ModelAndView("saludar",miModelo); // (vista,mapa)

	}
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView irASaludarrrr() {
				
		return new ModelAndView(new RedirectView("saludar") ) ; // (vista,mapa)

	}
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView bienvenidos() {
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Melanie");
		empleado.setDni(12345678);
		
		ModelMap  miModelo = new ModelMap();
		miModelo.put("empleado", empleado); // (clave unica , objeto q cree)
		
		return new ModelAndView("home",miModelo); // (vista,mapa)

	}
	
	@RequestMapping(value="home/amigo",method=RequestMethod.GET)
	public ModelAndView irHomeAmigo(
	@RequestParam(value="FirstName")String nombre,
	@RequestParam(value="LastName")String apellido) {
		String msj1 ="El nombre ingresado es: "+nombre ;
		String msj2 ="El apellido es: "+apellido;
		
		ModelMap model=new ModelMap();
		model.put("mensaje1", msj1);
		model.put("mensaje2", msj2);
		
		return new ModelAndView("mensaje",model);
	}
	
	
	//para ingresar http://localhost:8080/Prueba/home/amiga/nombre/Melanie/apellido/Lugones
	@RequestMapping(value="home/amiga/nombre/{nombre}/apellido/{apellido}",method=RequestMethod.GET)
	public ModelAndView irHomeAmigo2(@PathVariable String nombre ,@PathVariable String apellido){
		String msj1 ="El nombre ingresado es: "+nombre ;
		String msj2 ="El apellido es: "+apellido;
		
		ModelMap model=new ModelMap();
		model.put("mensaje1", msj1);
		model.put("mensaje2", msj2);
		
		return new ModelAndView("mensaje",model);
	}
	
	
	
}
