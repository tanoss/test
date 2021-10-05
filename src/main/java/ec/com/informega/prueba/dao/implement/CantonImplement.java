package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.model.Canton;
import ec.com.informega.prueba.service.CantonService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CantonImplement implements CantonService {
    @Override
    public List<Canton> getAllCanton() {
        return null;
    }

    @Override
    public String saveCanton(Canton user) {
        return null;
    }

    @Override
    public String editCanton(Canton user) {
        return null;
    }

    @Override
    public String deleteCanton(Long id) {
        return null;
    }

    @Override
    public Canton findCanton(Long id) {
        return null;
    }
}
