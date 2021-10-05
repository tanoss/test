package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.model.Estado;
import ec.com.informega.prueba.service.EstadoService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class EstadoImplement implements EstadoService {
    @Override
    public List<Estado> getAllsector() {
        return null;
    }

    @Override
    public String saveEstado(Estado estado) {
        return null;
    }

    @Override
    public String editEstado(Estado estado) {
        return null;
    }

    @Override
    public String deleteEstado(Long id) {
        return null;
    }

    @Override
    public Estado findEstado(Long id) {
        return null;
    }
}
