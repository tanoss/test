package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.PerfilRepository;
import ec.com.informega.prueba.dao.UsuarioRepository;
import ec.com.informega.prueba.model.Perfil;
import ec.com.informega.prueba.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PerfilImplement implements PerfilService {

    @Autowired
    private PerfilRepository rep;

    @Override
    public List<Perfil> getAllPerfil()  {
        return rep.findAll();
    }

    @Override
    public String savePerfil(Perfil perfil) {

        rep.save(perfil);
        return  "éxito";
    }

    @Override
    public String editPerfil(Perfil perfil) {
        rep.save(perfil);
        return null;
    }

    @Override
    public String deletePerfil(Long id)  {
        rep.deleteById(id);
        return "éxito";
    }

    @Override
    public Perfil findPerfil(Long id) {
        return rep.findById(id).get();
    }
}
