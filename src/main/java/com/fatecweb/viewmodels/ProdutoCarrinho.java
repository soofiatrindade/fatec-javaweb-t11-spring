/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.viewmodels;

import com.fatecweb.models.Produto;

public class ProdutoCarrinho {
    private Produto produto;
    private int quantidade;

    public ProdutoCarrinho(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float getTotal() {
        return this.quantidade * this.getProduto().getPreco();
    }
    
    public void incrementarQuantidade() {
        quantidade++;
    }
}
    