package com.example.aula3ex1.service;

import java.util.List;

import com.example.aula3ex1.dtos.CategoriaCursoDTO;
import com.example.aula3ex1.dtos.CategoriaInserirDTO;

public interface CategoriaCursoService {
    List<CategoriaCursoDTO> obterTodos();
    CategoriaInserirDTO inserir(CategoriaInserirDTO categoriaCursoDTO);
    CategoriaCursoDTO obterPorId(Long id);
    CategoriaCursoDTO editar(Long id, CategoriaCursoDTO categoriaCursoDTO);
    void excluir(Long id);
}
