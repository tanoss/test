package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Canton;
import ec.com.informega.prueba.model.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
   //Estado findById(Long id);

}
