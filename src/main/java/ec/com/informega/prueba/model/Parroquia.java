package ec.com.informega.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="PARROQUIA")
public class Parroquia {
    @SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq", allocationSize = 1)
    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "usuario_seq")
    private Long id;
}