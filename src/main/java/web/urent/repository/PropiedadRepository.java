package web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.urent.model.Propiedades;
@Repository
public interface PropiedadRepository extends JpaRepository<Propiedades, Integer> {

}
