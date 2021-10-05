package ec.com.informega.prueba.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PEDIDO",schema = "public")
public class Pedido {
    @SequenceGenerator(name = "seq_pedido", sequenceName = "seq_pedido", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_pedido")
    private Long id;


    @Column(name = "pedido_hora_inicio")
    private Date horaInicio;

    @Column(name = "pedido_hora_fin")
    private Date horaFin;

    @Column(name = "pedido_fecha_pedido")
    private Date horaPedido;

    @Column(name = "ESTADO_id")
    private Integer estadoId;

    @Column(name = "PRODUCTO_id")
    private Integer productoId;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "repartidor_id")
    private Long repartidorId;

    @Column(name = "CLIENTE_ID")
    private Long clienteId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Date getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Date horaPedido) {
        this.horaPedido = horaPedido;
    }

    public Integer getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Integer estadoId) {
        this.estadoId = estadoId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getRepartidorId() {
        return repartidorId;
    }

    public void setRepartidorId(Long repartidorId) {
        this.repartidorId = repartidorId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}
