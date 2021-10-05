package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Canton;
import ec.com.informega.prueba.model.Sector;

import java.util.List;

public interface SectorService {
    public List<Sector> getAllsector();

    public String saveSector(Sector user);

    public String editSector(Sector user);

    public String deleteSector(Long id);

    public Sector findSector(Long id);


}
