package main;

public class InstrumentoMusical {

	private String modelo;
	private Double preco;
	
	public InstrumentoMusical() {
		super();
	}

	public InstrumentoMusical(String modelo, Double preco) {
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String avaliarPreco() {
		return preco.compareTo(Double.valueOf(15000.00)) > 0 ? "Muito caro!! Compra outro." : "Valor razoável.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
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
		InstrumentoMusical other = (InstrumentoMusical) obj;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InstrumentoMusical [modelo=" + modelo + ", preco=" + preco + "]";
	}
	
}
