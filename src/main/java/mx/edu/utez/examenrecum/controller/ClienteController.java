package mx.edu.utez.examenrecum.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.examenrecum.model.dto.ClienteDto;
import mx.edu.utez.examenrecum.model.entity.ClienteBean;
import mx.edu.utez.examenrecum.service.impl.ClienteImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examen/cliente")
@AllArgsConstructor
public class ClienteController {
    private final ClienteImpl clienteService;

    @GetMapping
    public List<ClienteBean> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ClienteBean findById(Integer id){
        return clienteService.findById(id);
    }

    @PostMapping
    public ClienteDto save(ClienteDto cliente){
        ClienteBean clienteSave = clienteService.save(cliente);
        return ClienteDto.builder()
                .id_cliente(clienteSave.getId_cliente())
                .nombre(clienteSave.getNombre())
                .apellido_paterno(clienteSave.getApellido_paterno())
                .apellido_materno(clienteSave.getApellido_materno())
                .direccion(clienteSave.getDireccion())
                .contacto(clienteSave.getContacto())
                .build();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        ClienteBean cliente = clienteService.findById(id);
        clienteService.delete(cliente);
    }
    @PutMapping
    public ClienteDto update(@RequestBody ClienteDto cliente){
        ClienteBean clienteSave = clienteService.save(cliente);
        return ClienteDto.builder()
                .id_cliente(clienteSave.getId_cliente())
                .nombre(clienteSave.getNombre())
                .apellido_paterno(clienteSave.getApellido_paterno())
                .apellido_materno(clienteSave.getApellido_materno())
                .direccion(clienteSave.getDireccion())
                .contacto(clienteSave.getContacto())
                .build();
    }

}
