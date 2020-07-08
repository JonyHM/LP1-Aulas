package br.com.fatec.connectionDb.model.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import br.com.fatec.connectionDb.model.enums.SEXO;

@MappedSuperclass
public class Pessoa {

	@Column
	private String nome;
	
	@Column
	@Enumerated(EnumType.STRING)
	private SEXO sexo;
	
	@Column
	private Double altura;
	
	@Column
	private Double massa;
	
	public Pessoa() {}
	
	public Pessoa(String nome, SEXO sexo, Double altura, Double massa) {		
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
		this.massa = massa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SEXO getSexo() {
		return sexo;
	}

	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altura == null) ? 0 : altura.hashCode());
		result = prime * result + ((massa == null) ? 0 : massa.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (massa == null) {
			if (other.massa != null)
				return false;
		} else if (!massa.equals(other.massa))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", altura=" + altura + ", massa=" + massa + "]";
	}
	
}

