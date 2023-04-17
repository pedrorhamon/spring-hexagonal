package com.starking.hexagonal.dominio.portas.repositories;

import java.util.List;

/**
 * @author pedroRhamon
 *
 */
public interface ProdutoRepositoryPort {
    List<Produto> buscarTodos();

    Produto buscarPeloSku(String sku);

    void salvar(Produto produto);
}
