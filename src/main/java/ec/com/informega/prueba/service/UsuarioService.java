package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> getUsers();

    public void saveUser(Usuario user);

    public void deleteUser(Long id);

    public void editUser(Usuario usuario);

    public Usuario findUser(Long id);

    public Usuario findUserName(String username);


}
