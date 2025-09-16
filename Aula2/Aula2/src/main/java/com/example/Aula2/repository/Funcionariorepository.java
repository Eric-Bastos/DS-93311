package com.example.Aula2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Aula2.model.Funcionario;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface Funcionariorepository extends JpaRepository<Funcionario, UUID> {
}
