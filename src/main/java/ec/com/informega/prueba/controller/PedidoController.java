package ec.com.informega.prueba.controller;


import ec.com.informega.prueba.dao.implement.PedidoImplement;
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
public class PedidoController {
    @Autowired
    private PedidoImplement pedido;

    @GetMapping("/pedidos")
    public ResponseEntity pedidos(){
        List<Pedido> response = this.pedido.pedidos();
        return new  ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping("/pedidoRepartidor/{idRepartidor}")
    public ResponseEntity pedidoRepartidor(@PathVariable Long idRepartidor){
        List<Pedido> response = pedido.pedidoRepartidor(idRepartidor);
        return new  ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @PostMapping("/pedido")
    public ResponseEntity pedidoEdit(@RequestBody Pedido pedido){
         this.pedido.updateRepartidor(pedido);
        return new  ResponseEntity<>(true, HttpStatus.ACCEPTED);
    }

    @PostMapping("/pedidos")
    public ResponseEntity pedidoAdd(@RequestBody Pedido pedido){
        boolean response = this.pedido.crearPedido(pedido);
        return new  ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
