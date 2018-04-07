package comidas;

public class Pizzas {
	private String nomep;
	private double precop;
	
	public Pizzas(String nomep, double precop) {
		super();
		this.nomep = nomep;
		this.precop = precop; 
	}
	public String getNomep() {
		return nomep;
	}
	public void setNomep(String nomep) {
		this.nomep = nomep;
	}
	
	public Double getPrecoP() {
		return precop;
	}
	
	public void setPrecop(double precop) {
		this.precop = precop;
	}

}
