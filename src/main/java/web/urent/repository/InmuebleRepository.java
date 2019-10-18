package web.urent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import web.urent.model.Inmueble;
@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {
	@Query("select a from Inmueble a where a.estado=1 and a.disponibilidad=1")
	List<Inmueble> listar();
}
