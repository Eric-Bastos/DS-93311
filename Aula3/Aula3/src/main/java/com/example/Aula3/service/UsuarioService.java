package com.example.Aula3.service;

import com.example.Aula3.model.Usuario;
import com.example.Aula3.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired // Faz o papel do construtor
    private UsuarioRepository usuarioRepository;

    // Consulta no bando de dados
    public List<Usuario> ListarTodos() {
        return usuarioRepository.findAll();
    }

    // Salvar no banco de dados
    public Usuario salvar(Usuario usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado");
        }
        return usuarioRepository.save(usuario);
    }

}
