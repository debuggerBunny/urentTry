package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.urent.model.Distancia;
import web.urent.repository.DistanciaRepository;
@Service
public class DistanciaServiceImpl implements DistanciaService{

	@Autowired
	private DistanciaRepository distanciaRepositorio;
	@Override
	public List<Distancia> getAll() {
		return distanciaRepositorio.findAll();
	}

	@Override
	public void save(Distancia distancia) {
		distanciaRepositorio.save(distancia);
	}

	@Override
	public Distancia get(int id) {
		return distanciaRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Distancia dist= distanciaRepositorio.getOne(id);
		dist.setEstado((byte)(0));
		distanciaRepositorio.save(dist);
		
	}
}
