package com.example.Spring.controller;

import com.example.Spring.dto.ProdutoRequestDTO;
import com.example.Spring.dto.ProdutoResponseDTO;
import com.example.Spring.model.ProdutoModel;
import com.example.Spring.service.ProdutoService;
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
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody ProdutoRequestDTO dto){
        ProdutoModel p = produtoService.salvarProduto(dto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getId()).toUri();
        return ResponseEntity.created(location).body(Map.of("mensagem", "Produto cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>> atualizar(@PathVariable Long id, @Valid @RequestBody ProdutoRequestDTO dto){
        produtoService.atualizarProduto(id, dto);
        return ResponseEntity.ok(Map.of("mensagem", "Produto atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProdutoResponseDTO> deletar(@PathVariable Long id){
        ProdutoModel p = produtoService.deletarProdutoRetornando(id);
        ProdutoResponseDTO resp = new ProdutoResponseDTO(p.getNome(), p.getLote(), p.getValidade(), p.getCategoria(), p.getQuantidade());
        return ResponseEntity.ok(resp);
    }




}
