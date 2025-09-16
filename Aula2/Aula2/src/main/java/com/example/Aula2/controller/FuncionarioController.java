package com.example.Aula2.controller;

import com.example.Aula2.model.Funcionario;
import com.example.Aula2.repository.Funcionariorepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")

public class FuncionarioController {
    private Funcionariorepository funcionariorepository;

    public FuncionarioController(Funcionariorepository funcionariorepository) {
        this.funcionariorepository = funcionariorepository;
    }

    @GetMapping
    public List<Funcionario> listarTodos() {
        return funcionariorepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario) {
        funcionariorepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}
