package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.model.Parroquia;
import ec.com.informega.prueba.service.ParroquiaService;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Parroquiaimplement implements ParroquiaService {
    @Override
    public List<Parroquia> getAllParroquia() {
        return null;
    }

    @Override
    public String saveParroquia(Parroquia parroquia) {
        return null;
    }

    @Override
    public String editParroquia(Parroquia parroquia) {
        return null;
    }

    @Override
    public String deleteParroquia(Long id) {
        return null;
    }

    @Override
    public Parroquia findParroquia(Long id) {
        return null;
    }
}
