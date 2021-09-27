package com.lojadegames.lojadegames.model.produtoModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ProdutoModel {
	
	public @Id @GeneratedValue(strategy = GenerationType.IDENTITY)Long idProduto;
	public @NotBlank String preco;
	public @NotBlank String fabricante;
}
