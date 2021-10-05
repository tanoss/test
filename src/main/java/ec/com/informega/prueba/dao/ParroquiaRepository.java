package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Parroquia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParroquiaRepository extends JpaRepository<Parroquia, Long> {
    //Parroquia findById (Long id);
}
