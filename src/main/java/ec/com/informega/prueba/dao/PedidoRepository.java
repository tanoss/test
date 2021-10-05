package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByRepartidorId(Integer idRepartidor);

    @Query("FROM Pedido f WHERE f.repartidorId = :repartidor ORDER BY 2 ASC")
    List<Pedido> findPedidosRepartidor(@Param("repartidor") Long id);


    //from pedido where repartidor_id = 1 And pedido_fecha_pedido::date = NOW()::timestamp::date;

    @Query("FROM Pedido f WHERE f.repartidorId = :repartidor And f.horaPedido ::date = NOW()::timestamp::date")
    List<Pedido> findPedidosPorDia(@Param("repartidor") Long repartidor);

//    @Query(value = "SELECT * FROM Pedido f WHERE f.repartidorId = :repartidor And f.horaPedido::date = NOW()::timestamp::date", nativeQuery = true)
//    List<Pedido> findPedidosPorDia(@Param("repartidor") Long repartidor);
}
