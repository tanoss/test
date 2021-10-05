package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.CantonRepository;
import ec.com.informega.prueba.model.Canton;
import ec.com.informega.prueba.service.CantonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CantonImplement implements CantonService {
    @Autowired
    private CantonRepository rep;

    @Override
    public List<Canton> getAllCanton() {
        return rep.findAll();
    }

    @Override
    public String saveCanton(Canton canton) {
        rep.save(canton);
        return "éxito";
    }

    @Override
    public String editCanton(Canton canton) {
        rep.save(canton);
        return null;
    }

    @Override
    public String deleteCanton(Long id)  {
        rep.deleteById(id);
        return "éxito";
    }


    @Override
    public Canton findCanton(Long id) {
        return rep.findById(id).get();
    }
}
