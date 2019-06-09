package com.leonardomota.springmoney.api.resource;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.leonardomota.springmoney.api.model.Pessoa;
import com.leonardomota.springmoney.api.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@PostMapping
	public ResponseEntity<Pessoa> criar (@Valid @RequestBody Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{/codigo}")
				.buildAndExpand(pessoa.getcodigo()).toUri();
		
		return ResponseEntity.created(uri).body(pessoaSalva);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Pessoa> buscarPorCodigo (@PathVariable Long codigo) {
		Pessoa pessoa = pessoaRepository.findOne(codigo);
		if (pessoa == null) {
			return ResponseEntity.noContent().build();
		}
	
		return ResponseEntity.ok().body(pessoa);
	}
}
