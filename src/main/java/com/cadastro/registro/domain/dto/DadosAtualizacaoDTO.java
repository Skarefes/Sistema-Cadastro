package com.cadastro.registro.domain.dto;

import com.cadastro.registro.domain.endereco.DadosEnderecoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;

public record DadosAtualizacaoDTO(
        Long id,
        String nome,
        @Email
        String email,
        String senha,
        @Valid  DadosEnderecoDTO enderecoDTO

) {
}
