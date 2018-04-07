package comidas;

import javax.swing.JOptionPane;

public class PopulaSobremesa {
	public Sobremesa[] populaArray() {
		Sobremesa[] sobremesa = {
				new Sobremesa("Selecione",0.0),
				new Sobremesa("Sorvete",6.00),
				new Sobremesa("Torrada",5.00),
				new Sobremesa("Bolo",4.00),
				new Sobremesa("Torta",8.00)
		};
		return sobremesa;
	}
	public Sobremesa buscaSobremesa(Sobremesa[] sobremesa, String nome) {
		for(Sobremesa s: sobremesa) {
			if(s.getNomes().contains(nome))
				return s;
		}
		return null;
	}
	
	public static void main(String[] args) {
		PopulaSobremesa popula = new PopulaSobremesa();
		String nome = JOptionPane.showInputDialog(null, "Escolha uma Sobremesa");
		System.out.println(popula.buscaSobremesa(popula.populaArray(), nome));
	}

}
