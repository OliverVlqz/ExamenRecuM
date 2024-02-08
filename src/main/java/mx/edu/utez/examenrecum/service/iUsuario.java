package mx.edu.utez.examenrecum.service;

import mx.edu.utez.examenrecum.model.dto.UsuarioDto;
import mx.edu.utez.examenrecum.model.entity.UsuarioBean;

import java.util.List;

public interface iUsuario {
    public UsuarioBean save(UsuarioDto usuario);
    public UsuarioBean findById(Integer id);
    public List<UsuarioBean> findAll();
    void delete(UsuarioBean usuario);
}
