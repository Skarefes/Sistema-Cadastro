package com.cadastro.registro.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Getter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(DadosEnderecoDTO dadosDTO){
        this.rua = dadosDTO.rua();
        this.numero = dadosDTO.numero();
        this.bairro = dadosDTO.bairro();
        this.cidade = dadosDTO.cidade();
        this.cep = dadosDTO.cep();
    }

    public void atualizarEndereco(DadosEnderecoDTO dadosDTO){
        if (dadosDTO!=null) {
            if (dadosDTO.rua() != null) {
                this.rua = dadosDTO.rua();
            }
            if (dadosDTO.numero() != null) {
                this.numero = dadosDTO.numero();
            }
            if (dadosDTO.bairro() != null) {
                this.bairro = dadosDTO.bairro();
            }
            if (dadosDTO.cep() != null) {
                this.cidade = dadosDTO.cidade();
            }
            if (dadosDTO.cep() != null) {
                this.cep = dadosDTO.cep();
            }
        }
    }
}
