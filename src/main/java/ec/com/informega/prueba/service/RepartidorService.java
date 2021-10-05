package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Repartidor;

import java.util.List;

public interface RepartidorService {

    Repartidor getRepartidorUsuario(Long id);

    public Repartidor getRepartidor(Long id);

    public List<Repartidor> getAllProducto();

    public String saveRepartidor(Repartidor repartidor);

    public String editRepartidor(Repartidor repartidor);

    public String deleteRepartidor(Long id);

    public Repartidor findRepartidor(Long id);

    public Repartidor findRepartidorbyId(Long id);


}
