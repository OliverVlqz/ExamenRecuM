package mx.edu.utez.examenrecum.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class ClienteDto {

    private Integer id_cliente;

    private String nombre;

    private String apellido_paterno;

    private String apellido_materno;

    private String direccion;

    private String contacto;
}
