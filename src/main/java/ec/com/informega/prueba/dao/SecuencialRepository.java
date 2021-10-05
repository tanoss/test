package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Secuencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecuencialRepository extends JpaRepository<Secuencial, Long> {
    //Secuencial findById(Long id);

}
