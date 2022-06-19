/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.services;

import com.fatecweb.controllers.interfaces.IProdutoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecweb.models.Produto;
import com.fatecweb.repository.ProdutoRepository;

@Service
public class ProdutoService implements IProdutoService {

	@Autowired
    ProdutoRepository produtoRepository;
    
    public List<Produto> listarProdutos() throws Exception {
    	List<Produto> produtos = new ArrayList<>();
    	Iterable<Produto> results = produtoRepository.findAll();
    	results.forEach(p -> produtos.add(p));
    	
    	/*
    	 * for(Produto p : results) {
    	 * 	produtos.add(p)
    	 * } 
    	 */
    		
        return produtos;
    }
    
    public List<Produto> listarProdutosCategoria(int idCategoria) throws Exception {
    	List<Produto> produtos = new ArrayList<>();
    	Iterable<Produto> results = produtoRepository.findByCategoria(idCategoria);
    	results.forEach(p -> produtos.add(p));
        return produtos;
    }
    
    public Optional<Produto> detalharProduto(int id) throws Exception {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto cadastrarProduto(Produto produto) throws Exception {
        return produtoRepository.save(produto);
    }
}
