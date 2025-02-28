package com.cadastro.registro.domain.dto;

import com.cadastro.registro.domain.model.Cadastro;

public record DadosListagemCadastro(Long id, String nome, String email, String cidade) {
    public DadosListagemCadastro(Cadastro cadastro){
        this(cadastro.getId(), cadastro.getNome(), cadastro.getEmail(), cadastro.getEndereco().getCidade());
    }
}
