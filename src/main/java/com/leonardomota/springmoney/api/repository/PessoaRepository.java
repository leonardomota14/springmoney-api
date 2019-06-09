package com.leonardomota.springmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardomota.springmoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
