package br.com.fatec.connectionDb.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.fatec.connectionDb.model.enums.SEXO;

@Entity
public class Professor extends Pessoa {

	@Id
	private String matricula;

	public Professor() {}
	
	public Professor(String matricula, String nome, SEXO sexo, Double altura, Double massa) {
		super(nome, sexo, altura, massa);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Professor other = (Professor) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Professor [matricula=" + matricula + "]";
	}
	
}

