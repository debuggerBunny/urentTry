package web.urent.service;

import java.util.List;

import web.urent.model.Distancia;

public interface DistanciaService {

	public List<Distancia> getAll();
	
	public void save(Distancia distancia);
	
	public Distancia get(int id);
	
	public void delete(int id);
	
}
