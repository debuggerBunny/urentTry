package web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.urent.model.Arriendo;
@Repository
public interface ArriendoRepository extends JpaRepository<Arriendo, Integer> {

}
