package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Propiedades;
import web.urent.service.PropiedadService;


@RequestMapping("/Propiedad")
@Controller
public class PropiedadController {

	@Autowired
	private PropiedadService propiedad;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", propiedad.getAll());
		return "indexPropiedad";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Propiedades", propiedad.get(id));
		}else {
			model.addAttribute("Propiedades", new Propiedades());
		}
		return "savePropiedad";		
	}
	@PostMapping("/save")
	public String save(Model model, Propiedades admin) {
		propiedad.save(admin);
		return "redirect:/Propiedad/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		propiedad.delete(id);
		return "redirect:/Propiedad/";
	}
}
