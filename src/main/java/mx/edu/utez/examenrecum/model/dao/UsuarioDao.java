package mx.edu.utez.examenrecum.model.dao;

import mx.edu.utez.examenrecum.model.entity.UsuarioBean;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<UsuarioBean, Integer> {
}
