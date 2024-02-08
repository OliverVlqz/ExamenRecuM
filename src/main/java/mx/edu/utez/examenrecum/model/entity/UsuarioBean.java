package mx.edu.utez.examenrecum.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UsuarioBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    @Column(unique = true, nullable = false)
    private String nombre;
    @Column(length = 8)
    private String contrasena;
    @Column()
    private Boolean status;


}
