package mx.edu.utez.examenrecum.model.dao;

import mx.edu.utez.examenrecum.model.entity.ClienteBean;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<ClienteBean, Integer> {
}
