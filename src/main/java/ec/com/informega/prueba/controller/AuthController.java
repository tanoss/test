package ec.com.informega.prueba.controller;

import ec.com.informega.prueba.dao.implement.UsuarioImplement;
import ec.com.informega.prueba.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ws/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UsuarioImplement usuario;

    @PostMapping("/verificar")
    public ResponseEntity buscarUsername(@RequestBody Usuario username){
        Usuario response = usuario.findUserName(username.getUsuarioUsername());
        if(response!=null){

            if(response.getUsuarioPassword().equals(username.getUsuarioPassword())){
                return new  ResponseEntity(true, HttpStatus.ACCEPTED);
            }else{
                return new  ResponseEntity(false, HttpStatus.ACCEPTED);
            }

        }

        return new  ResponseEntity(false, HttpStatus.ACCEPTED);
    }


}
