package web.urent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import web.urent.model.Arrendatario;
@Repository
public interface ArrendatarioRepository extends JpaRepository<Arrendatario, Integer> {
	@Query("select a from Arrendatario a where a.estado=1")
	List<Arrendatario> listar();
}
