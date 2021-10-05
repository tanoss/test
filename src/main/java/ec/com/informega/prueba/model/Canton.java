package ec.com.informega.prueba.model;


import javax.persistence.*;

@Entity
@Table(name="CANTON")
public class Canton {
    @SequenceGenerator(name = "seq_canton", sequenceName = "seq_canton", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_canton")
    private Long id;

    @Column(name = "canton_nombre")
    private String cantonNombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCantonNombre() {
        return cantonNombre;
    }

    public void setCantonNombre(String cantonNombre) {
        this.cantonNombre = cantonNombre;
    }
}
