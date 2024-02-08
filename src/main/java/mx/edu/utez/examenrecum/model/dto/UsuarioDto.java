package mx.edu.utez.examenrecum.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UsuarioDto {
    private Integer id_usuario;
    private String nombre;
    private String contrasena;
    private Boolean status;

}
