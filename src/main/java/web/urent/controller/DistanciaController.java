package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Distancia;
import web.urent.service.DistanciaService;

@RequestMapping("/Distancia")
@Controller
public class DistanciaController {

	@Autowired
	private DistanciaService distancia;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", distancia.getAll());
		return "indexDistancia";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		Integer id1 = Integer.valueOf(id);
		if(id1!=null && id1 != 0) {
			model.addAttribute("Distancia", distancia.get(id));
		}
		if(id1==0) {
			return "guardar";
		}
		return "saveDistancia";		
	}
	@PostMapping("/agregar")
	public String save(Model model, Distancia admin) {
		distancia.save(admin);
		return "redirect:/Distancia/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		distancia.delete(id);
		return "redirect:/Distancia/";
	}
}
