package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.SecuencialRepository;
import ec.com.informega.prueba.model.Secuencial;
import ec.com.informega.prueba.service.SecuencialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SecuenciaImplement implements SecuencialService {

    @Autowired
    private SecuencialRepository secue;


    @Override
    public Secuencial getSecuencial(Long id) {
        return null;
    }

    @Override
    public List<Secuencial> getAllSecuencial() {
        return null;
    }

    @Override
    public String saveSecuencial(Secuencial secuencial) {
        return null;
    }

    @Override
    public String editSecuencial(Secuencial secuencial) {
        return null;
    }

    @Override
    public String deleteSecuencial(Long id) {
        return null;
    }

    @Override
    public Secuencial findSecuencial(Long id) {
        return null;
    }

    @Override
    public Secuencial findSecuencialbyId(Long id) {
        return null;
    }
}
