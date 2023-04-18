package com.starking.hexagonal.dominio.portas.repositories;

import java.util.List;

import com.starking.hexagonal.dominio.Produto;

/**
 * @author pedroRhamon
 *
 */
public interface ProdutoRepositoryPort {
	List<Produto> buscarTodos();

	Produto buscarPeloSku(String sku);

	void salvar(Produto produto);
}
