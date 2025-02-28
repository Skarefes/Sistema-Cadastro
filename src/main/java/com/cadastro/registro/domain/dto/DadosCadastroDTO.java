package com.cadastro.registro.domain.dto;

import com.cadastro.registro.domain.endereco.DadosEnderecoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroDTO(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank
        String senha,
        @NotNull @Valid
        DadosEnderecoDTO endereco
) {

}