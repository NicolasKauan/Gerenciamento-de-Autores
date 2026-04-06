package com.nika.GerenciamentoDeAutores.repositories;

import com.nika.GerenciamentoDeAutores.model.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
