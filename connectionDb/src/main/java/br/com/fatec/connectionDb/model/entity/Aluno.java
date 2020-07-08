package br.com.fatec.connectionDb.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.fatec.connectionDb.model.enums.SEXO;

@Entity
public class Aluno extends Pessoa {

	@Id
	private String ra;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String ra, String nome, SEXO sexo, Double altura, Double massa) {
		super(nome, sexo, altura, massa);
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ra == null) ? 0 : ra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (ra == null) {
			if (other.ra != null)
				return false;
		} else if (!ra.equals(other.ra))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + "]";
	}
	
}

