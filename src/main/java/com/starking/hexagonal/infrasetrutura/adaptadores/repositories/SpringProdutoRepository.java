package com.starking.hexagonal.infrasetrutura.adaptadores.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starking.hexagonal.infrasetrutura.adaptadores.entidades.ProdutoEntity;

/**
 * @author pedroRhamon
 *
 */
@Repository
public interface SpringProdutoRepository extends JpaRepository<ProdutoEntity, UUID> {
    Optional<ProdutoEntity> findBySku(String sku);
}