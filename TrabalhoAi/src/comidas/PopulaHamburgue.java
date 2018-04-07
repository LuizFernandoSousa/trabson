package comidas;

import javax.swing.JOptionPane;


public class PopulaHamburgue {
	public Hamburgue[] populaArray() {
		Hamburgue[] hamburgues = {
				new Hamburgue("Selecione",0.0),
				new Hamburgue("X-tudo",10.00),
				new Hamburgue("X-nada",5.00),
				new Hamburgue("X-quase tudo",7.00),
				new Hamburgue("X-tudo e mais um pouco",20.00)};
		return hamburgues;
		
	}
	public Hamburgue buscaHamburgue(Hamburgue[] hamburgue, String nome) {
		for(Hamburgue h: hamburgue) {
			if(h.getNomeh().contains(nome))
				return h;
		}
		return null;
	}
	
	public static void main(String[] args) {
		PopulaHamburgue popula = new PopulaHamburgue();
		String nome = JOptionPane.showInputDialog(null, "Escolha um Hamburgue");
		System.out.println(popula.buscaHamburgue(popula.populaArray(), nome));
	}

}
