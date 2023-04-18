package com.starking.hexagonal.infrasetrutura.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.starking.hexagonal.dominio.adaptadores.services.PedidoServiceImp;
import com.starking.hexagonal.dominio.portas.interfaces.ProdutoServicePort;
import com.starking.hexagonal.dominio.portas.repositories.ProdutoRepositoryPort;

/**
 * @author pedroRhamon
 *
 */
@Configuration
public class BeanConfiguracao {

	@Bean
	ProdutoServicePort produtoService(ProdutoRepositoryPort produtoRepositoryPort) {
		return new PedidoServiceImp(produtoRepositoryPort);
	}
}
