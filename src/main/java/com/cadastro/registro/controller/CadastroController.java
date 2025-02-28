package com.cadastro.registro.controller;

import com.cadastro.registro.domain.model.Cadastro;
import com.cadastro.registro.repository.CadastroRepository;
import com.cadastro.registro.domain.dto.DadosAtualizacaoDTO;
import com.cadastro.registro.domain.dto.DadosCadastroDTO;
import com.cadastro.registro.domain.dto.DadosListagemCadastro;
import com.cadastro.registro.service.CadastrarService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Autowired
    private CadastrarService cadastrarService;

    @PostMapping
    @Transactional
    public ResponseEntity<String> Cadastrar(@RequestBody @Valid DadosCadastroDTO dadosDTO){
       try {
           var cadastro = new Cadastro(dadosDTO);
           cadastroRepository.save(cadastro);
           return ResponseEntity.ok().build();
       }catch (ValidationException e){
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }

     @GetMapping
     public ResponseEntity<List<DadosListagemCadastro>> Listar(){
        List<DadosListagemCadastro> listagem = cadastrarService.listaCadastros();
        return ResponseEntity.ok(listagem);
     }

     @PutMapping
     @Transactional
     public ResponseEntity alterarCadastro( @RequestBody @Valid DadosAtualizacaoDTO dto){
        try {
            cadastrarService.alterarCadastro(dto);
            return ResponseEntity.ok().build();
        }catch (ValidationException e){
            return ResponseEntity.badRequest().build();
        }
     }

     @DeleteMapping("/{id}")
     @Transactional
     public ResponseEntity deletarCadastro(@PathVariable Long id){
        try{
            cadastrarService.deletarCadastro(id);
            return ResponseEntity.ok().build();
        }catch (ValidationException e){
            return ResponseEntity.noContent().build();
        }
     }
}