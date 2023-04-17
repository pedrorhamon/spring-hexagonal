package com.starking.hexagonal.aplicacao.adaptadores.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;

/**
 * @author pedroRhamon
 *
 */

@RestController
@RequestMapping("produtos")
public class ProdutoController {

	 private final ProdutoServicePort produtoServicePort;

	    public ProdutoController(ProdutoServicePort produtoServicePort) {
	        this.produtoServicePort = produtoServicePort;
	    }

	    @PostMapping
	    void criarProdutos(@RequestBody ProdutoDTO produtoDTO) {
	        produtoServicePort.criarProduto(produtoDTO);
	    }

	    @GetMapping
	    List<ProdutoDTO> getProdutos() {
	        return produtoServicePort.buscarProdutos();
	    }

	    @PutMapping(value = "/{sku}")
	    void atualizarEstoque(@PathVariable String sku, @RequestBody EstoqueDTO estoqueDTO) throws NotFoundException {
	        produtoServicePort.atualizarEstoque(sku, estoqueDTO);
	    }
	}
