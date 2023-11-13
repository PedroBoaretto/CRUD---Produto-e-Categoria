package com.example.aula3ex1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.aula3ex1.models.CategoriaCurso;
import com.example.aula3ex1.models.Curso;
import com.example.aula3ex1.repository.CategoriaCursoRepository;
import com.example.aula3ex1.repository.CursoRepository;

@SpringBootApplication
public class Aula3ex1Application {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Aula3ex1Application.class, args);
	}

	@Bean
	public CommandLineRunner init(@Autowired CategoriaCursoRepository categoriaCursoRepository, @Autowired CursoRepository cursoRepository){
		return args -> {

			CategoriaCurso categoria1 = new CategoriaCurso(null, "Tecnologia", null);
			CategoriaCurso categoria2 = new CategoriaCurso(null, "Saude", null);
			CategoriaCurso categoria3 = new CategoriaCurso(null, "Direito", null);

			categoriaCursoRepository.save(categoria1);
			categoriaCursoRepository.save(categoria2);
			categoriaCursoRepository.save(categoria3);

			CategoriaCurso categoria1Encontrada = categoriaCursoRepository.findById(1L).get();
			CategoriaCurso categoria2Encontrada = categoriaCursoRepository.findById(2L).get();
			CategoriaCurso categoria3Encontrada = categoriaCursoRepository.findById(3L).get();

			Curso curso1 = new Curso(null, "Ciencia da Computação", 420, categoria1Encontrada);
			Curso curso2 = new Curso(null, "Fisioterapia", 400, categoria2Encontrada);
			Curso curso3 = new Curso(null, "Direito Civil", 500, categoria3Encontrada);

			cursoRepository.save(curso1);
			cursoRepository.save(curso2);
			cursoRepository.save(curso3);

			List<Curso> tecnologiaList = new ArrayList<>();
			tecnologiaList.add(curso1);
			
			List<Curso> exercicioList = new ArrayList<>();
			exercicioList.add(curso2);

			List<Curso> leituraList = new ArrayList<>();
			leituraList.add(curso3);

			categoria1Encontrada.setCursos(tecnologiaList);
			categoria2Encontrada.setCursos(exercicioList);
			categoria3Encontrada.setCursos(leituraList);

			categoriaCursoRepository.save(categoria1Encontrada);
			categoriaCursoRepository.save(categoria2Encontrada);
			categoriaCursoRepository.save(categoria3Encontrada);
		};
	}

}
