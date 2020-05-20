package main;

import helpers.GENERO;

public class AlunoFatecSJC {

	private String nome;
	private int semestre;
	private int idade;
	private GENERO genero;
	
	public AlunoFatecSJC() {}
	
	public AlunoFatecSJC(String nome, int semestre, int idade, GENERO genero) {
		super();
		this.nome = nome;
		this.semestre = semestre;
		this.idade = idade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public GENERO getGenero() {
		return genero;
	}

	public void setGenero(GENERO genero) {
		this.genero = genero;
	}

	public void estudar() {
		String sentimento = genero == GENERO.FEMININO ? "tranquila" : "cansado demais"; 
		System.out.printf("%s está estudando.... e está %s", nome, sentimento);
	}
	
	public void dormir() {
		System.out.println("FATECANO NÃO DORME!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + semestre;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoFatecSJC other = (AlunoFatecSJC) obj;
		if (genero != other.genero)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (semestre != other.semestre)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String sem = semestre < 0 ? "indefinido (famoso 'nem eu sei')" : String.valueOf(semestre);
		return "AlunoFatecSJC [nome=" + nome + ", semestre=" + sem + ", idade=" + idade + ", genero=" + genero
				+ "]";
	}
	
}
