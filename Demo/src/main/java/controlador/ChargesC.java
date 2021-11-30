package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import interfaceService.ChargesServiceCrud;
import modelo.Charges;

@Controller
@RequestMapping
public class ChargesC {

	@Autowired
	private ChargesServiceCrud service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Charges>charges=service.listar();
		model.addAttribute("charge",charges);
		return "Charges";
	}
	
}
