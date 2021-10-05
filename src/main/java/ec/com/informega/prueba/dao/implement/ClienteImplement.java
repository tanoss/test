package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.ClienteRepository;
import ec.com.informega.prueba.model.Cliente;
import ec.com.informega.prueba.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteImplement implements ClienteService {
    @Autowired
    private ClienteRepository rep;

    @Override
    public List<Cliente> getAllCliente() {
        return null;
    }

    @Override
    public String saveCliente(Cliente cliente) {
        return null;
    }

    @Override
    public String editCliente(Cliente cliente) {
        return null;
    }

    @Override
    public String deleteCliente(Long id) {
        return null;
    }

    @Override
    public Cliente findCliente(Long id) {
       return rep.findById(id).get();
    }

    @Override
    public Cliente findClientebyUser(Long id) {
        return rep.findByUsuarioId(id);
    }
}
