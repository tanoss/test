package ec.com.informega.prueba.model;


import javax.persistence.*;

@Entity
@Table(name="ESTADO")
public class Estado {
    @SequenceGenerator(name = "seq_estado", sequenceName = "seq_estado", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_estado")
    private Long id;

    @Column(name = "estado_desc")
    private String estadoDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstadoDesc() {
        return estadoDesc;
    }

    public void setEstadoDesc(String estadoDesc) {
        this.estadoDesc = estadoDesc;
    }
}
