package ec.com.informega.prueba.controller;

import ec.com.informega.prueba.dao.implement.UsuarioImplement;
import ec.com.informega.prueba.dao.implement.UsuarioImplement;
import ec.com.informega.prueba.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ws")
@CrossOrigin(origins = "*")
public class UsuarioController {
    @Autowired
    private UsuarioImplement usuario;


    @GetMapping("/usuario")
    public ResponseEntity all(){
        List<Usuario> response = usuario.getUsers();
        return new  ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<String> buscar(@PathVariable Long id){
        usuario.findUser(id);
        return new  ResponseEntity<String>("Se encontro correctamente correcatmente",HttpStatus.ACCEPTED);
    }

    @PostMapping("/usuario")
    public ResponseEntity<String> guardar(@RequestBody Usuario usuario){
        this.usuario.saveUser(usuario);
        return new  ResponseEntity<String>("dd", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        usuario.deleteUser(id);
        return new  ResponseEntity<String>("Se elimino correcatmente",HttpStatus.ACCEPTED);
    }

    @PutMapping("/usuario")
    public ResponseEntity<String> editar(@RequestBody Usuario usuario){
        this.usuario.editUser(usuario);
        return new  ResponseEntity<String>("Se encontro correctamente correcatmente",HttpStatus.ACCEPTED);
    }

    @GetMapping("/usuarioUser/{username}")
    public ResponseEntity buscarUsername(@PathVariable String username){
        Usuario response = usuario.findUserName(username);

        return new  ResponseEntity(response,HttpStatus.ACCEPTED);
    }
    
    
    
}
