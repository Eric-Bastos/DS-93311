package com.example.Aula.Controller;

import com.example.Aula.Model.Pessoa;
import com.example.Aula.Repository.RepositoryPessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class ControllerPessoa {
    private RepositoryPessoa pessoaRepository;

    public ControllerPessoa(RepositoryPessoa pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    @GetMapping
    public List<Pessoa>listarTodos(){
        return pessoaRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<Pessoa>salvar(@RequestBody Pessoa pessoa){
        pessoaRepository.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
    }


}
