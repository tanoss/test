package ec.com.informega.prueba.controller;

import ec.com.informega.prueba.dao.implement.UsuarioImplement;
import ec.com.informega.prueba.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/SotWs/api/welcome")
@CrossOrigin(origins = "*")
public class welcomeController {

    @Autowired
    private UsuarioImplement user;

    @GetMapping("/hi")
    public ResponseEntity<List<Usuario>> welcome (){
       // rep.findAll()
        return new ResponseEntity<List<Usuario>>(user.getUsers(),HttpStatus.ACCEPTED);
    }

    @GetMapping("/hi1")
    public ResponseEntity<String> welcome1 (){
        return new ResponseEntity("hello world", HttpStatus.ACCEPTED);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardar(@RequestBody Usuario user){
        this.user.saveUser(user);
        return new  ResponseEntity<String>("dd",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> eliminar(@RequestParam Long id){
        user.deleteUser(id);
        return new  ResponseEntity<String>("Se elimino correcatmente",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/buscar")
    public ResponseEntity<String> buscar(@RequestParam Long id){
        user.findUser(id);
        return new  ResponseEntity<String>("Se encontro correctamente correcatmente",HttpStatus.ACCEPTED);
    }

}
