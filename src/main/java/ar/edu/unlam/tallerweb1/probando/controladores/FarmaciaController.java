package ar.edu.unlam.tallerweb1.probando.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class FarmaciaController {
	
	//http://localhost:8080/Prueba/operacion/suma/operador1/4/operador2/5
	@RequestMapping(value="operacion/{operacion}/operador1/{operador1}/operador2/{operador2}",method=RequestMethod.GET)
	public ModelAndView irA (@PathVariable String operacion,@PathVariable Integer operador1,@PathVariable Integer operador2) {
				
		switch (operacion) {
			case "sumar": 
				ModelMap model = new ModelMap();
				model.put("valor1", operador1);
				model.put("valor2", operador2);
				return new ModelAndView ("suma",model);
					
			case "restar":
				ModelMap model2 = new ModelMap();
				model2.put("valor1", operador1);
				model2.put("valor2", operador2);
				return new ModelAndView ("resta",model2);
								
			case "dividir":
				if(operador2!=0) {
					ModelMap model3 = new ModelMap();
					model3.put("valor1", operador1);
					model3.put("valor2", operador2);
					
					return new ModelAndView ("division",model3);
				}else {
					String msj2 = "El operador2 no debe ser 0";
					ModelMap errorDiv = new ModelMap();
					errorDiv.put("errorDiv", msj2);
					
					return new ModelAndView ("division",errorDiv);
				}
				
			case "multiplicar":
				ModelMap model4 = new ModelMap();
				model4.put("valor1", operador1);
				model4.put("valor2", operador2);
				return new ModelAndView ("multiplicacion",model4);
			}
				
				
			String error = "Debe ingresar una operacion valida ";
				
			ModelMap modelError = new ModelMap();
			modelError.put("msj", error);
			
			return new ModelAndView ("error",modelError);
	
		}
	
}
