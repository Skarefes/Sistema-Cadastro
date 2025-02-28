package com.cadastro.registro.repository;

import com.cadastro.registro.domain.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository <Cadastro, Long> {
    //Page <Cadastro> findById(Pageable paginacao);
}
