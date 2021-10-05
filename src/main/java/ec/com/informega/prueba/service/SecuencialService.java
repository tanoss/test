package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Secuencial;

import java.util.List;

public interface SecuencialService {


    Secuencial getSecuencial(Long id);

    List<Secuencial> getAllSecuencial();

    String saveSecuencial(Secuencial secuencial);

    String editSecuencial(Secuencial secuencial);

    String deleteSecuencial(Long id);

    Secuencial findSecuencial(Long id);

    Secuencial findSecuencialbyId(Long id);
}
