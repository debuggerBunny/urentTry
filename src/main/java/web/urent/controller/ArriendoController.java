package web.urent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.urent.model.Arriendo;
import web.urent.service.ArriendoService;

@RequestMapping("/Arriendo")
@Controller
public class ArriendoController {

	@Autowired
	private ArriendoService arriendo;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", arriendo.getAll());
		return "indexArriendo";
	}
	
	@GetMapping("/save/{id}")
	public String showsave(@PathVariable("id") int id, Model model) {
		if(id!=0) {
			model.addAttribute("Arriendo", arriendo.get(id));
		}else {
			model.addAttribute("Arriendo", new Arriendo());
		}
		return "saveArriendo";		
	}
	@PostMapping("/save")
	public String save(Model model, Arriendo admin) {
		arriendo.save(admin);
		return "redirect:/Arriendo/";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		arriendo.delete(id);
		return "redirect:/Arriendo/";
	}
}
