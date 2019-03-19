package br.com.hdi.conex.datasource.model.user.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.hdi.conex.datasource.model.user.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT u.nome FROM User u WHERE u.cpf =:cpf")
    String findUserByCpf(@Param("cpf") String cpf);

}
