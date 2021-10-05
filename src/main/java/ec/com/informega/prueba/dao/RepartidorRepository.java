package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Repartidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepartidorRepository extends JpaRepository<Repartidor, Long> {

    Repartidor findByUsuarioId(Long id);
}
