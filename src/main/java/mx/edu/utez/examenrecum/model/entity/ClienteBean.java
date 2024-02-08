package mx.edu.utez.examenrecum.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClienteBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    @Column
    private String nombre;
    @Column
    private String apellido_paterno;
    @Column
    private String apellido_materno;
    @Column
    private String direccion;
    @Column
    private String contacto;

}
