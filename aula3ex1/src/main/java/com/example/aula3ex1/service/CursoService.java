package com.example.aula3ex1.service;

import java.util.List;

import com.example.aula3ex1.dtos.CursoDTO;
import com.example.aula3ex1.dtos.CursoInserirDTO;

public interface CursoService {
    List<CursoDTO> obterTodos();
    CursoInserirDTO inserir(CursoInserirDTO cursoDTO);
    CursoDTO obterPorId(Long id);
    CursoDTO editar(Long id, CursoDTO cursoDTO);
    void excluir(Long id);
}
