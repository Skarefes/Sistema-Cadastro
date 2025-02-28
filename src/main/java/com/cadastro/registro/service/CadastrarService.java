package com.cadastro.registro.service;

import com.cadastro.registro.domain.model.Cadastro;
import com.cadastro.registro.repository.CadastroRepository;
import com.cadastro.registro.domain.dto.DadosAtualizacaoDTO;
import com.cadastro.registro.domain.dto.DadosCadastroDTO;
import com.cadastro.registro.domain.dto.DadosListagemCadastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastrarService {

    @Autowired
    private CadastroRepository repository;

    public void cadastrar(DadosCadastroDTO dto){

    }

    public List<DadosListagemCadastro> listaCadastros(){
        return repository.findAll().stream()
                .map(DadosListagemCadastro::new).toList();
    }

    public void alterarCadastro(DadosAtualizacaoDTO dados){
        Cadastro cadastro = repository.getReferenceById(dados.id());
        cadastro.atualizarCadastro(dados);
    }

    public void deletarCadastro(Long id){
        Cadastro cadastro = repository.getReferenceById(id);
        repository.delete(cadastro);
    }
}
