package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> getAllCliente();

    public String saveCliente(Cliente cliente);

    public String editCliente(Cliente cliente);

    public String deleteCliente(Long id);

    public Cliente findCliente(Long id);

    public Cliente findClientebyUser(Long id);
}
