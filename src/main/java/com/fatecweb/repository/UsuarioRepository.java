/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.repository;

import org.springframework.data.repository.CrudRepository;
import com.fatecweb.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
