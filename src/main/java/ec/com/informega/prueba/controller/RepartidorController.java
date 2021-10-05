package ec.com.informega.prueba.controller;

import ec.com.informega.prueba.dao.implement.RepartidorImplement;
import ec.com.informega.prueba.model.Repartidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ws/")
@CrossOrigin(origins = "*")
public class RepartidorController {

    @Autowired
    private RepartidorImplement repartidor;

    @GetMapping("/repartidorId/{id}")
    public ResponseEntity clienteID(@PathVariable Long id){
        Repartidor response = repartidor.getRepartidorUsuario(id);
        return new  ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
