package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.RepartidorRepository;
import ec.com.informega.prueba.model.Repartidor;
import ec.com.informega.prueba.service.RepartidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RepartidorImplement implements RepartidorService {
    @Autowired
    private RepartidorRepository rep;

    @Override
    public Repartidor getRepartidorUsuario(Long id) {
        return rep.findByUsuarioId(id);
    }

    @Override
    public Repartidor getRepartidor(Long id) {
        return null;
    }

    @Override
    public List<Repartidor> getAllProducto() {
        return null;
    }

    @Override
    public String saveRepartidor(Repartidor repartidor) {
        return null;
    }

    @Override
    public String editRepartidor(Repartidor repartidor) {
        return null;
    }

    @Override
    public String deleteRepartidor(Long id) {
        return null;
    }

    @Override
    public Repartidor findRepartidor(Long id) {
        return null;
    }

    @Override
    public Repartidor findRepartidorbyId(Long id) {
        return null;
    }
}
