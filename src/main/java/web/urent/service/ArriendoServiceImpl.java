package web.urent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.urent.repository.ArriendoRepository;
import web.urent.model.Arriendo;
@Service
public class ArriendoServiceImpl implements ArriendoService {

	@Autowired
	private ArriendoRepository arriendoRepositorio;
	@Override
	public List<Arriendo> getAll() {
		return arriendoRepositorio.findAll();
	}

	@Override
	public void save(Arriendo arriendo) {
		arriendoRepositorio.save(arriendo);
		
	}

	@Override
	public Arriendo get(int id) {
		return arriendoRepositorio.getOne(id);
	}

	@Override
	public void delete(int id) {
		Arriendo arri= arriendoRepositorio.getOne(id);
		arri.setEstado((byte)(0));
		arriendoRepositorio.save(arri);
		
	}
}
