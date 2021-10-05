package ec.com.informega.prueba.controller;

import ec.com.informega.prueba.dao.implement.PerfilImplement;
import ec.com.informega.prueba.dao.implement.ProductoImplement;
import ec.com.informega.prueba.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ws")
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    private ProductoImplement producto;

    @GetMapping("/productos")
    public ResponseEntity all(){
         List<Producto> response = producto.getProducts();
        return new  ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
