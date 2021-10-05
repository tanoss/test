package ec.com.informega.prueba.controller;

import ec.com.informega.prueba.dao.implement.ClienteImplement;
import ec.com.informega.prueba.dao.implement.PedidoImplement;
import ec.com.informega.prueba.model.Cliente;
import ec.com.informega.prueba.model.Pedido;
import ec.com.informega.prueba.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ws")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteImplement cliente;

    @GetMapping("/clienteByUser/{id}")
    public ResponseEntity clienteID(@PathVariable Long id){
        Cliente response = cliente.findClientebyUser(id);
        return new  ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
