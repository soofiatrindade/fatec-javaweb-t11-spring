/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.controllers.interfaces;

import java.util.List;
import java.util.Optional;

import com.fatecweb.models.Produto;

public interface IProdutoService {
    List<Produto> listarProdutos() throws Exception;
    Optional<Produto> detalharProduto(int id) throws Exception;
    Produto cadastrarProduto(Produto produto) throws Exception;
    List<Produto >listarProdutosCategoria(int idCategoria) throws Exception;
}
