package com.starking.hexagonal.infrasetrutura.adaptadores.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pedroRhamon
 *
 */
@Entity
@Table(name = "produtos")
public class ProdutoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID codigo;
	private String sku;
	private String nome;
	private Double preco;
	private Double quantidade;

	public ProdutoEntity() {
	}

	public ProdutoEntity(Produto produto) {
		this.sku = produto.getSku();
		this.nome = produto.getNome();
		this.preco = produto.getPreco();
		this.quantidade = produto.getQuantidade();
	}

	public void atualizar(Produto produto) {
		this.sku = produto.getSku();
		this.nome = produto.getNome();
		this.preco = produto.getPreco();
		this.quantidade = produto.getQuantidade();
	}

	public Produto toProduto() {
		return new Produto(this.codigo, this.sku, this.nome, this.quantidade, this.preco);
	}
}