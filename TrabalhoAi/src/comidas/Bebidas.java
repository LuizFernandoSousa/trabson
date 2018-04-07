package comidas;

public class Bebidas {
	private String nomeb;
	private double precob;
	
	public Bebidas(String nomeb, double precob) {
		super();
		this.nomeb = nomeb;
		this.precob = precob; 
	}
	public String getNomeb() {
		return nomeb;
	}
	public void setNomeb(String nomeb) {
		this.nomeb = nomeb;
	}
	
	public double getPrecoB() {
		return precob;
	}
	
	public void setPreco(double precob) {
		this.precob = precob;
	}

}
