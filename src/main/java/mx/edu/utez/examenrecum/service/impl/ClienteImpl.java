package mx.edu.utez.examenrecum.service.impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.examenrecum.model.dao.ClienteDao;
import mx.edu.utez.examenrecum.model.dto.ClienteDto;
import mx.edu.utez.examenrecum.model.entity.ClienteBean;
import mx.edu.utez.examenrecum.service.iCliente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ClienteImpl implements iCliente {
    private final ClienteDao clienteDao;
    @Override
    public ClienteBean save(ClienteDto cliente) {
        ClienteBean clienteBean = ClienteBean.builder()
                .id_cliente(cliente.getId_cliente())
                .nombre(cliente.getNombre())
                .apellido_paterno(cliente.getApellido_paterno())
                .apellido_materno(cliente.getApellido_materno())
                .direccion(cliente.getDireccion())
                .contacto(cliente.getContacto())
                .build();
        return clienteDao.save(clienteBean);
    }

    @Override
    public ClienteBean findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public List<ClienteBean> findAll() {
        return (List<ClienteBean>) clienteDao.findAll();
    }

    @Override
    public void delete(ClienteBean cliente) {
        clienteDao.delete(cliente);

    }
}
