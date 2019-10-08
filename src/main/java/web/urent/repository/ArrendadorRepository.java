package web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.urent.model.Arrendador;

@Repository
public interface ArrendadorRepository extends JpaRepository<Arrendador, Integer> {

}
