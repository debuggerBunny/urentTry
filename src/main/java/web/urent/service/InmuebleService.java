package web.urent.service;

import java.util.List;

import web.urent.model.Inmueble;

public interface InmuebleService {

	public List<Inmueble> getAll();
	
	public void save(Inmueble inmueble);
	
	public Inmueble get(int id);
	
	public void delete(int id);
}
