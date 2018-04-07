package comidas;

public class Hamburgue {

	private String nomeh;
	private double precoh;
	
	public Hamburgue(String nomeh, double precoh) {
		super();
		this.nomeh = nomeh;
		this.precoh = precoh; 
	}
	public String getNomeh() {
		return nomeh;
	}
	public void setNome(String nomeh) {
		this.nomeh = nomeh;
	}
	
	public double getPrecoh() {
		return precoh;
	}
	
	public void setPrecoh(double precoh) {
		this.precoh = precoh;
	}
	
	
}
