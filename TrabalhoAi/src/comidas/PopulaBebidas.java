package comidas;
import javax.swing.JOptionPane;



public class PopulaBebidas {
	public Bebidas[] populaArray() {
		Bebidas[] bebidas = {
				new Bebidas("Selecione",0.0),
				new Bebidas("Coca-Cola",9.00),
				new Bebidas("Pepsi",5.00),
				new Bebidas("Guarana Antartica",7.00),
				new Bebidas("Cerveja",20.00),
				new Bebidas("Agua", 5.00)
		};
		return bebidas;
	}
	
	public Bebidas buscaBebidas(Bebidas[] bebidas, String nome) {
		for(Bebidas b: bebidas) {
			if(b.getNomeb().contains(nome))
				return b;
		}
		return null;
	}
	
	public static void main(String[] args) {
		PopulaBebidas popula = new PopulaBebidas();
		String nome = JOptionPane.showInputDialog(null, "Escolha uma bebida");
		System.out.println(popula.buscaBebidas(popula.populaArray(), nome));
	}

}
