package web.urent.service;

import java.util.List;

import web.urent.model.Universidad;

public interface UniversidadService {
	

	public List<Universidad> getAll();
	
	public void save(Universidad universidad);
	
	public Universidad get(int id);
	
	public void delete(int id);
}
