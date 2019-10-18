package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Inmueble;
import web.urent.service.InmuebleService;

@RequestMapping("/Inmueble")
@Controller

public class InmuebleController {

	@Autowired
	private InmuebleService inmueble;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", inmueble.getAll());
		return "indexInmueble";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Inmueble", inmueble.get(id));
		}else {
			model.addAttribute("Inmueble", new Inmueble());
		}
		return "saveInmueble";		
	}
	@PostMapping("/save")
	public String save(Model model, Inmueble admin) {
		inmueble.save(admin);
		return "redirect:/Inmueble/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		inmueble.delete(id);
		return "redirect:/Inmueble/";
	}
}
