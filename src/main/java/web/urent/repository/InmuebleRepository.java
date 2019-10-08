package web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.urent.model.Inmueble;
@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {

}
