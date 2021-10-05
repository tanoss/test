package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Log_pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Log_pedidoRepository extends JpaRepository<Log_pedido, Long> {
}
