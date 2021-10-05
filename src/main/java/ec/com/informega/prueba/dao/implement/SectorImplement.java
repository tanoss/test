package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.SectorRepository;
import ec.com.informega.prueba.model.Sector;
import ec.com.informega.prueba.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SectorImplement implements SectorService {

    @Autowired
    private SectorRepository sector;
    @Override
    public List<Sector> getAllsector() {
        return null;
    }

    @Override
    public String saveSector(Sector user) {
        return null;
    }

    @Override
    public String editSector(Sector user) {
        return null;
    }

    @Override
    public String deleteSector(Long id) {
        return null;
    }

    @Override
    public Sector findSector(Long id) {
        return sector.findById(id).get();
    }
}
