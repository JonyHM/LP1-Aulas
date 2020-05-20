package main;

import helpers.GENERO;

public class Pessoa {

	private String nome;
	private int idade;
	private long peso;
	private GENERO genero;
	
	public Pessoa() {}

	public Pessoa(String nome, int idade, long peso, GENERO genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getPeso() {
		return peso;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}
	
	public GENERO getGenero() {
		return genero;
	}

	public void setGenero(GENERO genero) {
		this.genero = genero;
	}

	// métodos adicionais
	public void andar() {
		System.out.printf("%s está andando.", this.nome );
	}
	
	public void emagrecer(long peso) {
		this.peso =- peso;
		System.out.printf("%s emagreceu " + this.peso + "KG", this.nome);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (int) (peso ^ (peso >>> 32));
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
		Pessoa other = (Pessoa) obj;
		if (genero != other.genero)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (peso != other.peso)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", genero=" + genero + "]";
	}
	
}
