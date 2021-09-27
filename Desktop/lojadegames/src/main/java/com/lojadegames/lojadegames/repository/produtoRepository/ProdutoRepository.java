package com.lojadegames.lojadegames.repository.produtoRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lojadegames.lojadegames.model.produtoModel.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	
	
}
