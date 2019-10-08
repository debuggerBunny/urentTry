package web.urent.service;

import java.util.List;

import web.urent.model.Arrendatario;

public interface ArrendatarioService {

public List<Arrendatario> getAll();
	
	public void save(Arrendatario arrendatario);
	
	public Arrendatario get(int id);
	
	public void delete(int id);
	
}
