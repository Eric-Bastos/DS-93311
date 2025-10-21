package com.example.Spring.controller;

import com.example.Spring.dto.ClienteRequestDTO;
import com.example.Spring.dto.ClienteResponseDTO;
import com.example.Spring.model.ClienteModel;
import com.example.Spring.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody ClienteRequestDTO dto){
        ClienteModel cliente = clienteService.salvarCliente(dto);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cliente.getId()).toUri();

        return ResponseEntity.created(location).body(Map.of("mensagem", "Cliente cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @Valid @RequestBody ClienteRequestDTO dto){
        clienteService.atualizarCliente(id, dto);
        return ResponseEntity.ok(Map.of("mensagem", "Cliente atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> deletar(@PathVariable Long id){
        ClienteModel c = clienteService.deletarClienteRetornando(id);
        ClienteResponseDTO resp = new ClienteResponseDTO(c.getNome(), c.getEmail(), c.getTelefone(), c.getFormaPagamento(), c.getEndereco());
        return ResponseEntity.ok(resp);
    }


}
