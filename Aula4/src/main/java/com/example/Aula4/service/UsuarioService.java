package com.example.Aula4.service;

import com.example.Aula4.dto.UsuarioRequestDTO;
import com.example.Aula4.dto.UsuarioResponseDTO;
import com.example.Aula4.model.UsuarioModel;
import com.example.Aula4.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        if (usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email já cadastrado");
        }
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setEmail(usuarioRequestDTO.getEmail());
        usuario.setSenha(passwordEncoder.encode(usuarioRequestDTO.getSenha()));


        return usuarioRepository.save(usuario);

    }

    public List<UsuarioResponseDTO> listarTodos(){
        return usuarioRepository
                .findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }


}
