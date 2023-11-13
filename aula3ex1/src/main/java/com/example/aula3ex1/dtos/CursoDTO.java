package com.example.aula3ex1.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CursoDTO {
    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private String nomeCategoriaCurso;
}
