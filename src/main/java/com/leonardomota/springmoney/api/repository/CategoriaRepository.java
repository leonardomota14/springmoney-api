package com.leonardomota.springmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardomota.springmoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
