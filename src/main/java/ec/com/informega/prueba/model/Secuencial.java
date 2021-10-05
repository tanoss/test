package ec.com.informega.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="SECUENCIAL")
public class Secuencial {

    @SequenceGenerator(name = "seq_secuencial", sequenceName = "seq_secuencial", allocationSize = 1)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_secuencial")
    private Long id;

    @Column(name = "codigo")
    public String codigo;

    @Column(name = "desc")
    public String descripcion;

    @Column(name = "secuencial_module_id")
    public Long secuencialModuleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getSecuencialModuleId() {
        return secuencialModuleId;
    }

    public void setSecuencialModuleId(Long secuencialModuleId) {
        this.secuencialModuleId = secuencialModuleId;
    }
}
