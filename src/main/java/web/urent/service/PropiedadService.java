package web.urent.service;

import java.util.List;

import web.urent.model.Propiedades;

public interface PropiedadService {

	public List<Propiedades> getAll();
	
	public void save(Propiedades propiedades);
	
	public Propiedades get(int id);
	
	public void delete(int id);

}
