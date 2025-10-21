package com.example.Spring.service;

import com.example.Spring.dto.ClienteRequestDTO;
import com.example.Spring.dto.ClienteResponseDTO;
import com.example.Spring.model.ClienteModel;
import com.example.Spring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteResponseDTO> listarTodos(){
        return clienteRepository.findAll().stream()
                .map(c -> new ClienteResponseDTO(c.getNome(), c.getEmail(), c.getTelefone(), c.getFormaPagamento(), c.getEndereco()))
                .toList();
    }

    public ClienteModel salvarCliente(ClienteRequestDTO dto){
        clienteRepository.findByEmail(dto.getEmail()).ifPresent(c -> { throw new IllegalArgumentException("Email já cadastrado"); });

        ClienteModel cliente = new ClienteModel();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setFormaPagamento(dto.getFormaPagamento());
        cliente.setEndereco(dto.getEndereco());

        clienteRepository.save(cliente);

        return cliente;
    }

    public ClienteModel atualizarCliente(Long id, ClienteRequestDTO dto){
        ClienteModel cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));

        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setFormaPagamento(dto.getFormaPagamento());
        cliente.setEndereco(dto.getEndereco());

        clienteRepository.save(cliente);

        return cliente;
    }

    public ClienteModel deletarClienteRetornando(Long id){
        ClienteModel cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));

        clienteRepository.deleteById(id);

        return cliente;
    }

}

