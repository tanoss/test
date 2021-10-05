package ec.com.informega.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="PERFIL")
public class Perfil {
    @SequenceGenerator(name = "seq_perfil", sequenceName = "seq_perfil", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_perfil")
    private Long id;

    @Column(name = "perfil_nombre")
    private String perfilNombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerfilNombre() {
        return perfilNombre;
    }

    public void setPerfilNombre(String perfilNombre) {
        this.perfilNombre = perfilNombre;
    }
}
