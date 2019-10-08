package web.urent.service;


import java.util.List;

import web.urent.model.Arriendo;

public interface ArriendoService{
public List<Arriendo> getAll();
	
	public void save(Arriendo a);
	
	public Arriendo get(int id);
	
	public void delete(int id);
}
