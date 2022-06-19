/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.controllers.interfaces;

import java.util.Optional;

import com.fatecweb.models.Categoria;

/**
 *
 * @author MAQ01LAB04
 */
public interface ICategoriaService {
	Optional<Categoria> buscarPeloId(int idCategoria) throws Exception;
    Iterable<Categoria> listar() throws Exception;
}
