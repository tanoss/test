package ec.com.informega.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTO")
public class Producto {
    @SequenceGenerator(name = "seq_procuto", sequenceName = "seq_producto", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_producto")
    private Long id;

    @Column(name = "producto_descripcion")
    private String productoDescripcion;

    @Column(name = "stock")
    private Integer productoStok;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    public Integer getProductoStok() {
        return productoStok;
    }

    public void setProductoStok(Integer productoStok) {
        this.productoStok = productoStok;
    }
}
