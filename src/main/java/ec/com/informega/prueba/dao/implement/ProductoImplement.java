package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.model.Producto;
import ec.com.informega.prueba.service.ProductoService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductoImplement implements ProductoService {

    @Override
    public List<Producto> getAllProducto() {
        return null;
    }

    @Override
    public String saveProducto(Producto producto) {
        return null;
    }

    @Override
    public String editProducto(Producto producto) {
        return null;
    }

    @Override
    public String deleteProducto(Long id) {
        return null;
    }

    @Override
    public Producto findProducto(Long id) {
        return null;
    }

    @Override
    public Producto findProductobyId(Long id) {
        return null;
    }
}
