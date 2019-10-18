package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.urent.repository.InmuebleRepository;
import web.urent.model.Inmueble;
@Service
public class InmuebleServiceImpl implements InmuebleService {

	@Autowired
	private InmuebleRepository inmuebleRepositorio;

	@Override
	public List<Inmueble> getAll() {
		return inmuebleRepositorio.listar();
	}

	@Override
	public void save(Inmueble inmueble) {
		inmuebleRepositorio.save(inmueble);
	}

	@Override
	public Inmueble get(int id) {
		return inmuebleRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Inmueble inm = inmuebleRepositorio.getOne(id);
		inm.setEstado(0);
		inmuebleRepositorio.save(inm);
		
	}
}
