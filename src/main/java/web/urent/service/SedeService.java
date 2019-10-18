package web.urent.service;

import java.util.List;

import web.urent.model.Sede;

public interface SedeService {

	public List<Sede> getAll();
	
	public void save(Sede sede);
	
	public Sede get(int id);
	
	public void delete(int id);
}
