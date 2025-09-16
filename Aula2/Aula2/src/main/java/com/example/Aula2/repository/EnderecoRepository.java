package com.example.Aula2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Aula2.model.Endereco;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
}
