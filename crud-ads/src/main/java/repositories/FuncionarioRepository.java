package repositories;


import models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends  JpaRepository<FuncionarioModel, Long> {
}
