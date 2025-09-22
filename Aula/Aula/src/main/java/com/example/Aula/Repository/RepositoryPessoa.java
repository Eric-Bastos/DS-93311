package com.example.Aula.Repository;

import com.example.Aula.Model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryPessoa extends JpaRepository<Pessoa, UUID>{
}
