package mx.edu.utez.examenrecum.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.examenrecum.model.dto.UsuarioDto;
import mx.edu.utez.examenrecum.model.entity.UsuarioBean;
import mx.edu.utez.examenrecum.service.impl.UsuarioImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examen/usuario")
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioImpl usuarioService;

    @GetMapping
    public List<UsuarioBean> findAll(){
        return usuarioService.findAll();
    }
    @GetMapping("/{id}")
    public UsuarioBean findById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }
    @PostMapping
    public UsuarioDto save(@RequestBody UsuarioDto usuario){
        UsuarioBean clienteSave = usuarioService.save(usuario);
        return UsuarioDto.builder()
                .id_usuario(clienteSave.getId_usuario())
                .nombre(clienteSave.getNombre())
                .contrasena(clienteSave.getContrasena())
                .status(clienteSave.getStatus())
                .build();
    }
    @PutMapping
    public UsuarioDto update(@RequestBody UsuarioDto usuario){
        UsuarioBean clienteSave = usuarioService.save(usuario);
        return UsuarioDto.builder()
                .id_usuario(clienteSave.getId_usuario())
                .nombre(clienteSave.getNombre())
                .contrasena(clienteSave.getContrasena())
                .status(clienteSave.getStatus())
                .build();
    }
    @DeleteMapping("/{id}")
    ResponseEntity<?> delete(@PathVariable Integer id){
        UsuarioBean usuario = usuarioService.findById(id);
        usuarioService.delete(usuario);
        return ResponseEntity.ok().build();
    }


}
