/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.controllers.interfaces;

import java.util.List;
import com.fatecweb.models.Categoria;
import com.fatecweb.models.Usuario;

/**
 *
 * @author MAQ01LAB04
 */
public interface IUsuarioService {
    Usuario verificar(String nome, String senha) throws Exception;
}
