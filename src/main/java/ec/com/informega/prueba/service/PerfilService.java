package ec.com.informega.prueba.service;

import ec.com.informega.prueba.model.Perfil;

import java.util.List;

public interface PerfilService {
    public List<Perfil> getAllPerfil();

    public String savePerfil(Perfil user);

    public String editPerfil(Perfil user);

    public String deletePerfil(Long id);

    public Perfil findPerfil(Long id);
}
