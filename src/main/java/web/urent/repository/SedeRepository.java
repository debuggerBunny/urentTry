package web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.urent.model.Sede;
@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer> {

}
