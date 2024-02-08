package mx.edu.utez.examenrecum.service.impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.examenrecum.model.dao.UsuarioDao;
import mx.edu.utez.examenrecum.model.dto.UsuarioDto;
import mx.edu.utez.examenrecum.model.entity.UsuarioBean;
import mx.edu.utez.examenrecum.service.iUsuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UsuarioImpl implements iUsuario {
    private final UsuarioDao usuarioDao;
    @Override
    public UsuarioBean save(UsuarioDto usuario) {
        UsuarioBean usuarioBean= UsuarioBean.builder()
                .id_usuario(usuario.getId_usuario())
                .nombre(usuario.getNombre())
                .contrasena(generarContraseña())
                .status(true)
                .build();
        return usuarioDao.save(usuarioBean);
    }

    @Override
    public UsuarioBean findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    public List<UsuarioBean> findAll() {
        return (List<UsuarioBean>) usuarioDao.findAll();
    }

    @Override
    public void delete(UsuarioBean usuario) {
        usuarioDao.delete(usuario);
    }

    public String generarContraseña(){
        return UUID.randomUUID().toString().substring(0,8);
    }
}
