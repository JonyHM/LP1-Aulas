package br.com.fatec.connectionDb;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import br.com.fatec.connectionDb.model.entity.Aluno;
import br.com.fatec.connectionDb.model.entity.DisciplinaCurso;
import br.com.fatec.connectionDb.model.entity.Professor;
import br.com.fatec.connectionDb.model.enums.SEXO;
import br.com.fatec.connectionDb.service.Conexao;

public class App {
	
    public static void main( String[] args ) {
    	Aluno aluno1 = new Aluno(UUID.randomUUID().toString(), "Jão", SEXO.MASCULINO, 1.67, 71.1);
		Aluno aluno2 = new Aluno(UUID.randomUUID().toString(), "Maria", SEXO.FEMININO, 1.51, 45.2);
		Aluno aluno3 = new Aluno(UUID.randomUUID().toString(), "Fernando", SEXO.MASCULINO, 1.78, 85.5);
		Professor prof1 = new Professor(UUID.randomUUID().toString(), "Raimundo", SEXO.MASCULINO, 1.73, 81.7);
		Professor prof2 = new Professor(UUID.randomUUID().toString(), "Mariana", SEXO.FEMININO, 1.65, 52.3);

		Set<Aluno> alunos1 = new HashSet<Aluno>();
		alunos1.add(aluno2);
		alunos1.add(aluno3);
		
		Set<Aluno> alunos2 = new HashSet<Aluno>();
		alunos2.add(aluno1);
		
		Conexao conexao = new Conexao();
		
		DisciplinaCurso disciplina1 = new DisciplinaCurso("Matemática", prof2, alunos1);
		DisciplinaCurso disciplina2 = new DisciplinaCurso("Física", prof1, alunos2);
		
		conexao.Inserir(disciplina1);
		conexao.Inserir(disciplina2);
    }
}
