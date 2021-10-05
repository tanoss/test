package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {
    //Sector findById(Long id);
}
