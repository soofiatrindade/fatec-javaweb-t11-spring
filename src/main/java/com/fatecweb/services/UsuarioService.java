/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecweb.controllers.interfaces.IUsuarioService;
import com.fatecweb.models.Usuario;
import com.fatecweb.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {
    
	@Autowired
    UsuarioRepository usuarioRepository;


    public Usuario verificar(String nome, String senha) throws Exception {
        //return usuarioRepository.findAll().(nome, senha);
    	return null;
    }
}
