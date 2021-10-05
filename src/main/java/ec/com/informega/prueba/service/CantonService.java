package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Canton;
import ec.com.informega.prueba.model.Usuario;

import java.util.List;

public interface CantonService {
    public List<Canton> getAllCanton();

    public String saveCanton(Canton user);

    public String editCanton(Canton user);

    public String deleteCanton(Long id);

    public Canton findCanton(Long id);
}
