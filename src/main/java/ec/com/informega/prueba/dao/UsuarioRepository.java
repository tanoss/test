package ec.com.informega.prueba.dao;

import ec.com.informega.prueba.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 //   @Query("FROM usuario ORDER BY id ASC")
    List<Usuario> findAll();
    Usuario findByUsuarioUsername(String username);
//
//    @Query("FROM usuario c WHERE c.id =:id")
//    List<usuario> findAllById(@Param("id") Long id);
//
//    @Query("FROM usuario c WHERE c.id=:codM ORDER BY c.id ASC ")
//    List<usuario> findAllByIdMat(@Param("codM") Long codigo_matriz);
//    usuario findTopByOrderByIdDesc();
}
