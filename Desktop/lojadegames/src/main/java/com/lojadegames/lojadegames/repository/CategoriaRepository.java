package com.lojadegames.lojadegames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lojadegames.lojadegames.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	List<CategoriaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
}
