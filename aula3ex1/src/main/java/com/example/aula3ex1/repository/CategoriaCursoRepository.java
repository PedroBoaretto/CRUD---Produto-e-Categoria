package com.example.aula3ex1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aula3ex1.models.CategoriaCurso;

@Repository
public interface CategoriaCursoRepository extends JpaRepository<CategoriaCurso, Long>{
    
    Optional<CategoriaCurso> findByNome(String nome);

}
