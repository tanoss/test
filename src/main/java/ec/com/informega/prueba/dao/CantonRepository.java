package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Canton;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CantonRepository extends JpaRepository<Canton, Long> {
}
