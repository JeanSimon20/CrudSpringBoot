package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import interfaceService.AreaServiceCrud;
import modelo.Area;



@Controller
@RequestMapping
public class AreaC {

	@Autowired
	private AreaServiceCrud service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Area>areas=service.listar();
		model.addAttribute("areas",areas);
		return "Area";
	}
	
}
