package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import web.urent.model.Arrendador;
import web.urent.repository.ArrendadorRepository;

@Service
public class ArrendadorServiceImpl implements ArrendadorService{

	@Autowired
	private ArrendadorRepository arrendadorRepositorio;
	@Override
	public List<Arrendador> getAll() {	
		return arrendadorRepositorio.listar();
	}

	@Override
	public void save(Arrendador arrendador) {
		arrendadorRepositorio.save(arrendador);		
	}

	@Override
	public Arrendador get(int id) {
		return arrendadorRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Arrendador arrendador = arrendadorRepositorio.getOne(id);
		arrendador.setEstado(0);
		arrendadorRepositorio.save(arrendador);			
	}

}
