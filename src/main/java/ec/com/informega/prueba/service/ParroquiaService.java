package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Canton;
import ec.com.informega.prueba.model.Parroquia;

import java.util.List;

public interface ParroquiaService {
    public List<Parroquia> getAllParroquia();

    public String saveParroquia(Parroquia parroquia);

    public String editParroquia(Parroquia parroquia);

    public String deleteParroquia(Long id);

    public Parroquia findParroquia(Long id);
}
