package com.starking.hexagonal.dominio.portas.interfaces;

import java.util.List;

import com.starking.hexagonal.dominio.dtos.EstoqueDTO;
import com.starking.hexagonal.dominio.dtos.ProdutoDTO;

import javassist.NotFoundException;

/**
 * @author pedroRhamon
 *
 */
public interface ProdutoServicePort {

    List<ProdutoDTO> buscarProdutos();

    void criarProduto(ProdutoDTO produtoDTO);

    void atualizarEstoque(String sku, EstoqueDTO estoqueDTO) throws NotFoundException;
}
