package ec.com.informega.prueba.dao.implement;

import ec.com.informega.prueba.dao.PedidoRepository;
import ec.com.informega.prueba.model.Cliente;
import ec.com.informega.prueba.model.Pedido;
import ec.com.informega.prueba.model.Sector;
import ec.com.informega.prueba.model.Usuario;
import ec.com.informega.prueba.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class PedidoImplement implements PedidoService {
    @Autowired
    private PedidoRepository rep;
    @Autowired
    private SectorImplement sector;
    @Autowired
    private ClienteImplement cliente;



    @Override
    public List<Pedido> pedidoRepartidor(Long idRepartidor) {
        return rep.findPedidosRepartidor(idRepartidor);
    }



    @Override
    public void updateRepartidor(Pedido pedido) {
        Calendar now = Calendar.getInstance();
        if(pedido.getEstadoId()==2){
            pedido.setHoraInicio(now.getTime());
        }else if(pedido.getEstadoId()==3){
            pedido.setHoraFin(now.getTime());
        }
        rep.save(pedido);

    }

    @Override
    public boolean crearPedido(Pedido pedido) {
        Calendar now = Calendar.getInstance();
        pedido.setHoraPedido(now.getTime());
        Cliente response = cliente.findCliente(pedido.getClienteId());
        Sector sectorR = sector.findSector(response.getSectorId());
        pedido.setRepartidorId(sectorR.getRepartidor_id());

        System.out.println(rep.findPedidosPorDia(pedido.getRepartidorId()));
        rep.save(pedido);
        return true;
    }

    @Override
    public List<Pedido> pedidos() {
        return rep.findAll();
    }


}
