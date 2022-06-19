/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatecweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fatecweb.models.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	@Query(value = "SELECT * FROM Produto WHERE categoriaid = :idcategoria", nativeQuery = true)
	List<Produto> findByCategoria(@Param("idcategoria") int idCategoria);
}
