package web.urent.service;

import java.util.List;

import web.urent.model.Arrendador;


public interface ArrendadorService {

	public List<Arrendador> getAll();
	
	public void save(Arrendador arrendador);
	
	public Arrendador get(int id);
	
	public void delete(int id);
	
}
