package ec.com.informega.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="REPARTIDOR",schema = "public")
public class Repartidor {
    @SequenceGenerator(name = "seq_repartidor", sequenceName = "seq_repartidor", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_repartidor")
    private Long id;

    @Column(name = "usuario_id")
    private Long usuarioId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
