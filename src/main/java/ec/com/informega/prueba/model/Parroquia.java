package ec.com.informega.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="PARROQUIA")
public class Parroquia {
    @SequenceGenerator(name = "seq_parroquia", sequenceName = "seq_parroquia", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_parroquia")
    private Long id;

    @Column(name = "parroquia_nombre")
    private String parroquiaNombre;

    @Column(name = "canton_id")
    private Long cantonId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParroquiaNombre() {
        return parroquiaNombre;
    }

    public void setParroquiaNombre(String parroquiaNombre) {
        this.parroquiaNombre = parroquiaNombre;
    }

    public Long getCantonId() {
        return cantonId;
    }

    public void setCantonId(Long cantonId) {
        this.cantonId = cantonId;
    }
}
