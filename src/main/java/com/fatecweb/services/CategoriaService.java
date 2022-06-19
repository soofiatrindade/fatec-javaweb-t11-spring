/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.services;

import com.fatecweb.controllers.interfaces.ICategoriaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecweb.models.Categoria;
import com.fatecweb.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService {
    
	@Autowired
    CategoriaRepository categoriaRepository;
    
    @Override
    public Optional<Categoria> buscarPeloId(int idCategoria) throws Exception {
        return categoriaRepository.findById(idCategoria);
    }

    @Override
    public List<Categoria> listar() throws Exception {
    	List<Categoria> categorias = new ArrayList<>();
    	Iterable<Categoria> results = categoriaRepository.findAll();
    	results.forEach(c -> categorias.add(c));
    	return categorias;
    }
}
