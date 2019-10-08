package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Arrendatario;
import web.urent.service.ArrendatarioService;

@RequestMapping("/Arrendatario")
@Controller
public class ArrendatarioController {

	@Autowired
	private ArrendatarioService arrendatario;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", arrendatario.getAll());
		return "indexArrendatario";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Arrendatario", arrendatario.get(id));
		}else{
			return "guardar";
		}
		return "saveArrendatario";		
	}
	@PostMapping("/agregar")
	public String save(Model model, Arrendatario admin) {
		arrendatario.save(admin);
		return "redirect:/Arriendo/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		arrendatario.delete(id);
		return "redirect:/Arrendatario/";
	}
}
