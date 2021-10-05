package ec.com.informega.prueba.controller;


import ec.com.informega.prueba.dao.implement.PerfilImplement;
import ec.com.informega.prueba.dao.implement.UsuarioImplement;
import ec.com.informega.prueba.model.Perfil;
import ec.com.informega.prueba.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ws")
@CrossOrigin(origins = "*")
public class PerfilController {

    @Autowired
    private PerfilImplement perfil;

    @GetMapping("/perfil")
    public ResponseEntity all(){
        perfil.getAllPerfil();
        return new  ResponseEntity<>(perfil.getAllPerfil(),HttpStatus.ACCEPTED);
    }

    @GetMapping("/perfil/{id}")
    public ResponseEntity<String> buscar(@PathVariable Long id){
        perfil.findPerfil(id);
        return new  ResponseEntity<String>("Se encontro correctamente correcatmente",HttpStatus.ACCEPTED);
    }

    @PostMapping("/perfil")
    public ResponseEntity<String> guardar(@RequestBody Perfil perfil){
        this.perfil.savePerfil(perfil);
        return new  ResponseEntity<String>("dd", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/perfil/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        perfil.deletePerfil(id);
        return new  ResponseEntity<String>("Se elimino correcatmente",HttpStatus.ACCEPTED);
    }

    @PutMapping("/perfil")
    public ResponseEntity<String> editar(@RequestBody Perfil perfil){
        this.perfil.editPerfil(perfil);
        return new  ResponseEntity<String>("Se encontro correctamente correcatmente",HttpStatus.ACCEPTED);
    }


}
