package com.example.Aula.Repository;


import com.example.Aula.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryEndereco extends JpaRepository<Endereco, UUID> {
}
