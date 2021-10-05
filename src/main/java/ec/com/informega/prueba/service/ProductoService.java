package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Producto;

import java.util.List;

public interface ProductoService {


    public List<Producto> getAllProducto();

    public String saveProducto(Producto producto);

    public String editProducto(Producto producto);

    public String deleteProducto(Long id);

    public Producto findProducto(Long id);

    public Producto findProductobyId(Long id);
}
