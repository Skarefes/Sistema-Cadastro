package com.cadastro.registro.domain.model;

import com.cadastro.registro.domain.dto.DadosAtualizacaoDTO;
import com.cadastro.registro.domain.dto.DadosCadastroDTO;
import com.cadastro.registro.domain.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "cadastros")
@Entity(name = "Cadastro")
@AllArgsConstructor
@Getter@EqualsAndHashCode(of = "id")
public class Cadastro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    @Embedded
    private Endereco endereco;

    public Cadastro(){}

    public Cadastro( DadosCadastroDTO dadosDTO) {
        this.nome = dadosDTO.nome();
        this.email = dadosDTO.email();
        this.senha = dadosDTO.senha();
        this.endereco = new Endereco(dadosDTO.endereco());
    }

    public void atualizarCadastro(@Valid DadosAtualizacaoDTO dto){
        this.nome = dto.nome();
        if (dto.email()!=null) {
            this.email = dto.email();
        }
        if (dto.senha()!=null) {
            this.senha = dto.senha();
        }
        if (dto.enderecoDTO()!= null) {
            this.endereco.atualizarEndereco(dto.enderecoDTO());
        }
    }
}
