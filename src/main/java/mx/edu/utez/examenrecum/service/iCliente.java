package mx.edu.utez.examenrecum.service;

import mx.edu.utez.examenrecum.model.dto.ClienteDto;
import mx.edu.utez.examenrecum.model.entity.ClienteBean;

import java.util.List;

public interface iCliente {
    public ClienteBean save(ClienteDto cliente);
    public ClienteBean findById(Integer id);
    public List<ClienteBean> findAll();
    void delete(ClienteBean cliente);
}
