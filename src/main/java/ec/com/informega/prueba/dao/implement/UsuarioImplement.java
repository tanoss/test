package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.UsuarioRepository;
import ec.com.informega.prueba.model.Usuario;
import ec.com.informega.prueba.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImplement implements UsuarioService {
    @Autowired
    private UsuarioRepository rep;

    @Override
    public List<Usuario> getUsers() {
        return rep.findAll();
    }

    @Override
    public void saveUser(Usuario user) {
        
        rep.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        rep.deleteById(id);
    }

    @Override
    public void editUser(Usuario usuario) {
    rep.save(usuario);
    }

    @Override
    public Usuario findUser(Long id) {
        return rep.findById(id).get();
    }

    @Override
    public Usuario findUserName(String username) {

        return rep.findByUsuarioUsername (username);
    }
}
