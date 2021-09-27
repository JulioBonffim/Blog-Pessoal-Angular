package com.lojadegames.lojadegames.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lojadegames.lojadegames.model.CategoriaModel;
import com.lojadegames.lojadegames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired private CategoriaRepository repository;
	
	@GetMapping("/pegarTodos")
	public ResponseEntity<List<CategoriaModel>> getAll()
	{
		return ResponseEntity.ok().body(repository.findAll());
	}
	@GetMapping("/pegar_id/{pegar_id}")
	public ResponseEntity<Optional<CategoriaModel>> pegar_id (@PathVariable(value = "pegar_id")Long idCategoria)
	{
		return ResponseEntity.ok().body(repository.findById(idCategoria));
	}
	@PostMapping("/salvar")
	public ResponseEntity<CategoriaModel> post (@Valid @RequestBody CategoriaModel bodySalvar)
	{
		return ResponseEntity.status(201).body(repository.save(bodySalvar));
	}
	/*@PutMapping("/atualizar/{atualizar}")
	public ResponseEntity<CategoriaModel> put (@RequestBody CategoriaModel bodySalvar, @PathVariable(value = "atualizar")Long atualizar)
	{
		if(repository.existsById(atualizar)!=false && atualizar == bodySalvar.getId()) 
		{
			return ResponseEntity.status(201).body(repository.save(bodySalvar));
		}
		else 
		{
			return ResponseEntity.status(204).build();
		}
	}*/
	@DeleteMapping("/delete/{idCategoria}")
	public void delete (@PathVariable(value = "idCategoria")Long idCategoria) 
	{
		repository.deleteById(idCategoria);
	}
}
	 


