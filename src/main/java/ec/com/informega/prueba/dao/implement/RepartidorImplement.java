package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.RepartidorRepository;
import ec.com.informega.prueba.model.Repartidor;
import ec.com.informega.prueba.service.RepartidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepartidorImplement implements RepartidorService {
    @Autowired
    private RepartidorRepository rep;
    @Override
    public Repartidor getRepartidorUsuario(Long id) {
        return rep.findByUsuarioId(id);
    }
}
