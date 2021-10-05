package ec.com.informega.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="SECTOR")
public class Sector {

    @SequenceGenerator(name = "seq_sector", sequenceName = "seq_sector", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_sector")
    private Long id;

    @Column(name = "sector_nombre")
    private String sectorNombre;

    @Column(name = "parroquia_id")
    private Long parroquia_id;

    @Column(name = "repartidor_id")
    private Long repartidor_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSectorNombre() {
        return sectorNombre;
    }

    public void setSectorNombre(String sectorNombre) {
        this.sectorNombre = sectorNombre;
    }

    public Long getParroquia_id() {
        return parroquia_id;
    }

    public void setParroquia_id(Long parroquia_id) {
        this.parroquia_id = parroquia_id;
    }

    public Long getRepartidor_id() {
        return repartidor_id;
    }

    public void setRepartidor_id(Long repartidor_id) {
        this.repartidor_id = repartidor_id;
    }
}
