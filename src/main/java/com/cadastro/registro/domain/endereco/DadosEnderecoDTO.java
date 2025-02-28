package com.cadastro.registro.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEnderecoDTO(
        @NotBlank
        String rua,
        @NotBlank
        String numero,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank @Pattern(regexp = "\\d{8}")
        String cep
) {

}
