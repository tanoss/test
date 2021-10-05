package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByUsuarioId(Long id);
}
