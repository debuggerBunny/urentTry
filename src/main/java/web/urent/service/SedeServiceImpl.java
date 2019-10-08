package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.urent.model.Sede;
import web.urent.repository.SedeRepository;
@Service
public class SedeServiceImpl implements SedeService{

	@Autowired
	private SedeRepository sedeRepositorio;
	@Override
	public List<Sede> getAll() {
		return sedeRepositorio.findAll();
	}

	@Override
	public void save(Sede sede) {
		sedeRepositorio.save(sede);
	}

	@Override
	public Sede get(int id) {
		return sedeRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Sede sede= sedeRepositorio.getOne(id);
		sede.setEstado((byte)(0));
		sedeRepositorio.save(sede);
	}
}
