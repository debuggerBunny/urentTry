package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Sede;
import web.urent.service.SedeService;

@RequestMapping("/Sede")
@Controller
public class SedeController {

	@Autowired
	private SedeService sede;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", sede.getAll());
		return "indexSede";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Sede", sede.get(id));
		}else {
			model.addAttribute("Sede", new Sede());
		}	
		return "/saveSede";
	}
	@PostMapping("/Sede")
	public String save(Model model, Sede admin) {
		sede.save(admin);
		return "redirect:/Sede/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		sede.delete(id);
		return "redirect:/Sede/";
	}
}
