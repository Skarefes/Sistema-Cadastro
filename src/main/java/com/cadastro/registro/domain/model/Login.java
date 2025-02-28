package com.cadastro.registro.domain.model;

import jakarta.validation.constraints.NotBlank;

public record Login(
        @NotBlank
        String email,
        @NotBlank
        String senha) {
}
