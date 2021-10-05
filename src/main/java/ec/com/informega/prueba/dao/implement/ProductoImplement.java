package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.ProductoRepository;
import ec.com.informega.prueba.model.Producto;
import ec.com.informega.prueba.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoImplement implements ProductoService {

    @Autowired
    private ProductoRepository producto;
    @Override
    public List<Producto> getProducts() {
        return this.producto.findAll();
    }
}
