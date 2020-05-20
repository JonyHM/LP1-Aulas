package main;

public class Profissional {

	private String profissao;
	private Double salario;
	private int idade;
	
	public Profissional() {}

	public Profissional(String profissao, Double salario, int idade) {
		this.profissao = profissao;
		this.salario = salario;
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void perguntarSalario() {
		System.out.println("Eu ganho R$" + salario);
		if(idade < 23 && (salario.compareTo(Double.valueOf(3000)) > 0)) {
			System.out.println("Ganho bastante, né?");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		Profissional other = (Profissional) obj;
		if (idade != other.idade)
			return false;
		if (profissao == null) {
			if (other.profissao != null)
				return false;
		} else if (!profissao.equals(other.profissao))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profissional [profissao=" + profissao + ", salario=" + salario + ", idade=" + idade + "]";
	}
	
}
