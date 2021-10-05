package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Estado;

import java.util.List;

public interface EstadoService {
    public List<Estado> getAllsector();

    public String saveEstado(Estado estado);

    public String editEstado(Estado estado);

    public String deleteEstado(Long id);

    public Estado findEstado(Long id);
}
