package comidas;

public class Sobremesa {
	private String nomes;
	private double precoS;
	
	public Sobremesa(String nomes, double precoS) {
		super();
		this.nomes = nomes;
		this.precoS = precoS; 
	}
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	
	public double getPrecoS() {
		return precoS;
	}
	
	public void setPrecos(double precoS) {
		this.precoS = precoS;
	}

}
