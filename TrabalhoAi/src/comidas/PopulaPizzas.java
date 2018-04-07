package comidas;
import javax.swing.JOptionPane;

public class PopulaPizzas {
	public Pizzas[] populaArray() {
		Pizzas[] pizzas = {
				new Pizzas("Selecione",0.0),
				new Pizzas("Quatro queijos",35.00),
				new Pizzas("Calabresa",40.00),
				new Pizzas("Portuguesa",42.00),
				new Pizzas("Mussarela",32.00),
				new Pizzas("Frango com catupiri",40.00)
				
		};
		return pizzas;
	}
	public Pizzas buscaPizzas(Pizzas[] pizzas, String nome) {
		for(Pizzas p: pizzas) {
			if(p.getNomep().contains(nome))
				return p;
		}
		return null;
	}
	
	public static void main(String[] args) {
		PopulaPizzas popula = new PopulaPizzas();
		String nome = JOptionPane.showInputDialog(null, "Escolha uma Pizzas");
		System.out.println(popula.buscaPizzas(popula.populaArray(), nome));
	}

}
