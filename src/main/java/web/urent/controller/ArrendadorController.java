package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Arrendador;
import web.urent.service.ArrendadorService;

@RequestMapping("/Arrendador")
@Controller
public class ArrendadorController {

	@Autowired
	private ArrendadorService arrendador;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", arrendador.getAll());
		return "indexArrendador";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Arrendador", arrendador.get(id));
		}else{
			return "guardar";
		}
		return "saveArrendador";		
	}
	@PostMapping("/agregar")
	public String save(Model model, Arrendador admin) {
		arrendador.save(admin);
		return "redirect:/Arrendador/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		arrendador.delete(id);
		return "redirect:/Arrendador/";
	}
}
