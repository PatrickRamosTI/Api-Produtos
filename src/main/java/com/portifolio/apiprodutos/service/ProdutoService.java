package com.portifolio.apiprodutos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portifolio.apiprodutos.dto.ProdutoDTO;
import com.portifolio.apiprodutos.entity.Produto;
import com.portifolio.apiprodutos.repository.ProdutoRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProdutoService {

    private ProdutoRepository repository;

    // Criar
    public Produto criar(ProdutoDTO dto){
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        return repository.save(produto);
    }

    // Listar todos
    public List<Produto> ListarTodos(){
        return repository.findAll();
    }

    // Buscar por ID (agora com apenas um parâmetro Long)
    public Produto buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
    }

    // Atualizar
    public Produto atualizar(Long id, ProdutoDTO dto){
        Produto produto = buscarPorId(id);  
        produto.setNome(dto.getNome());     
        produto.setDescricao(dto.getDescricao());  
        produto.setPreco(dto.getPreco()); 
        return repository.save(produto); 
    }
    // Deletar
    public void deletar(Long id){
        Produto produto = buscarPorId(id);
        repository.delete(produto);
    }
}
