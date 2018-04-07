package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;

import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;

import comidas.Bebidas;
import comidas.Hamburgue;
import comidas.Pizzas;
import comidas.PopulaBebidas;
import comidas.PopulaHamburgue;
import comidas.PopulaPizzas;
import comidas.PopulaSobremesa;
import comidas.Sobremesa;

import javax.swing.event.ChangeEvent;

public class TelaPrincipal {

	private JFrame frame;
	private JTextField valorP;
	private JTextField valorAPagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	//Creation of counter method
	String junto(double v) {
		double [] juntos = new juntos[v];
		
		
		return null;
	};
	

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//--------------------AREA DE TUDO-----------------
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//--------------------AREA DO CABEÇALHO-----------------
		JLabel lblNewLabel = new JLabel("FAÇA SEU PEDIDO");
		lblNewLabel.setBounds(231, 11, 239, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(lblNewLabel);
		//--------------------AREA DO HAMBURGUE-----------------
		
		JLabel lblComer = new JLabel("HAMBURGERS");
		lblComer.setBounds(149, 59, 160, 32);
		lblComer.setHorizontalAlignment(SwingConstants.CENTER);
		lblComer.setFont(new Font("Arial Black", Font.BOLD, 17));
		frame.getContentPane().add(lblComer);
				
		JComboBox BoxHam1 = new JComboBox();
		BoxHam1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PopulaHamburgue popula = new PopulaHamburgue();
				Hamburgue hamburgue = popula.buscaHamburgue(popula.populaArray(), BoxHam1.getSelectedItem().toString());
				valorP.setText(Double.toString(hamburgue.getPrecoh()));				
			}
		});
		BoxHam1.setBounds(98, 111, 178, 22);
		BoxHam1.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "X-tudo", "X-nada", "X-quase tudo", "X-tudo e mais um pouco"}));
		BoxHam1.setToolTipText("");
		frame.getContentPane().add(BoxHam1);
		
		JComboBox BoxHam2 = new JComboBox();
		BoxHam2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PopulaHamburgue popula = new PopulaHamburgue();
				Hamburgue hamburgue = popula.buscaHamburgue(popula.populaArray(), BoxHam2.getSelectedItem().toString());
				valorP.setText(Double.toString(hamburgue.getPrecoh()));
			}
		});
		BoxHam2.setBounds(98, 144, 178, 22);
		BoxHam2.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "X-tudo", "X-nada", "X-quase tudo", "X-tudo e mais um pouco"}));
		BoxHam2.setToolTipText("");
		frame.getContentPane().add(BoxHam2);
		
		JComboBox BoxHam3 = new JComboBox();
		BoxHam3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaHamburgue popula = new PopulaHamburgue();
				Hamburgue hamburgue = popula.buscaHamburgue(popula.populaArray(), BoxHam3.getSelectedItem().toString());
				valorP.setText(Double.toString(hamburgue.getPrecoh()));
			}
		});
		BoxHam3.setBounds(98, 177, 178, 22);
		BoxHam3.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "X-tudo", "X-nada", "X-quase tudo", "X-tudo e mais um pouco"}));
		frame.getContentPane().add(BoxHam3);		
		
		//==============================================SPINNER=======================================================
		JSpinner spiham1 = new JSpinner();
		spiham1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				System.out.println(spiham1.getValue());
				int qtdEs = Integer.parseInt(spiham1.getValue().toString());
				String valorHa = valorP.getText();				
				double valorHamb = Double.parseDouble(valorHa);				
				String cu = junto(valorHamb, qtdEs);
				valorAPagar.setText(cu);
				/*
				 * 	String junto(double v, int q) {
					double tpg = v*q;					
					tpg += v;
					return String.valueOf(tpg);
					};*/
			}
		});
		
		spiham1.setBounds(286, 112, 48, 20);
		frame.getContentPane().add(spiham1);
		
		JSpinner spiham2 = new JSpinner();
		spiham2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spiham1.getValue());
				int qtdEs = Integer.parseInt(spiham2.getValue().toString());
				String valorHa = valorP.getText();
				double valorHamb = Double.parseDouble(valorHa);		
				String cu = junto(valorHamb, qtdEs);
				valorAPagar.setText(cu);
			}
		});
		spiham2.setBounds(286, 145, 48, 20);
		frame.getContentPane().add(spiham2);
		
		JSpinner spiham3 = new JSpinner();
		spiham3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				System.out.println(spiham1.getValue());
				int qtdEs = Integer.parseInt(spiham3.getValue().toString());
				String valorHa = valorP.getText();
				double valorHamb = Double.parseDouble(valorHa);				
				valorAPagar.setText((valorHamb*qtdEs)+" ");
			}
		});
		spiham3.setBounds(287, 178, 48, 20);
		frame.getContentPane().add(spiham3);
		
		//-----------------FECHA HAMBURGUE----------------------\\
		//--------------------AREA DA BEBIDA-----------------
		JLabel lblBeber = new JLabel("BEBIDAS");
		lblBeber.setBounds(160, 210, 115, 32);
		lblBeber.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeber.setFont(new Font("Arial Black", Font.BOLD, 18));
		frame.getContentPane().add(lblBeber);
		
		JComboBox BoxBb1 = new JComboBox();
		BoxBb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaBebidas popula = new PopulaBebidas();
				Bebidas bebidas = popula.buscaBebidas(popula.populaArray(), BoxBb1.getSelectedItem().toString());
				valorP.setText(Double.toString(bebidas.getPrecoB()));				
			}
		});
		BoxBb1.setBounds(99, 261, 178, 22);
		BoxBb1.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Coca-Cola", "Pepsi", "Guarana Antartica", "Cerveja", "Agua"}));
		frame.getContentPane().add(BoxBb1);
		
		JComboBox BoxBb2 = new JComboBox();
		BoxBb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaBebidas popula = new PopulaBebidas();
				Bebidas bebidas = popula.buscaBebidas(popula.populaArray(), BoxBb2.getSelectedItem().toString());
				valorP.setText(Double.toString(bebidas.getPrecoB()));
			}
		});
		BoxBb2.setBounds(99, 294, 178, 22);
		BoxBb2.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Coca-Cola", "Pepsi", "Guarana Antartica", "Cerveja", "Agua"}));
		frame.getContentPane().add(BoxBb2);
		
		JComboBox BoxBb3 = new JComboBox();
		BoxBb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaBebidas popula = new PopulaBebidas();
				Bebidas bebidas = popula.buscaBebidas(popula.populaArray(), BoxBb3.getSelectedItem().toString());
				valorP.setText(Double.toString(bebidas.getPrecoB()));
			}
		});
		BoxBb3.setBounds(99, 327, 178, 22);
		BoxBb3.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Coca-Cola", "Pepsi", "Guarana Antartica", "Cerveja", "Agua"}));
		frame.getContentPane().add(BoxBb3);	
		
		//==============================================SPINNER=======================================================
		JSpinner spinBb1 = new JSpinner();
		spinBb1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinBb1.getValue());
				int qtdEs = Integer.parseInt(spinBb1.getValue().toString());
				String valorHa = valorP.getText();
				double valorHamb = Double.parseDouble(valorHa);				
				valorAPagar.setText((valorHamb*qtdEs)+" ");
			}
		});
		spinBb1.setBounds(287, 261, 48, 20);
		frame.getContentPane().add(spinBb1);
		
		
		JSpinner spinBb2 = new JSpinner();
		spinBb2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinBb2.getValue());
				int qtdEs = Integer.parseInt(spinBb2.getValue().toString());
				String valorHa = valorP.getText();
				double valorHamb = Double.parseDouble(valorHa);				
				valorAPagar.setText((valorHamb*qtdEs)+" ");
			}
		});
		spinBb2.setBounds(287, 294, 48, 20);
		frame.getContentPane().add(spinBb2);
		
		JSpinner spinBb3 = new JSpinner();
		spinBb3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinBb3.getValue());
				int qtdEs = Integer.parseInt(spinBb3.getValue().toString());
				String valorHa = valorP.getText();
				double valorHamb = Double.parseDouble(valorHa);				
				valorAPagar.setText((valorHamb*qtdEs)+" ");
			}
		});
		spinBb3.setBounds(288, 327, 48, 20);
		frame.getContentPane().add(spinBb3);
		
		
		
		
		//--------------------FECHA BEBIDAS-----------------\\
		//--------------------AREA DOS PIZZA-----------------
		JComboBox BoxPz1 = new JComboBox();
		BoxPz1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaPizzas popula = new PopulaPizzas();
				Pizzas pizza = popula.buscaPizzas(popula.populaArray(), BoxPz1.getSelectedItem().toString());
				valorP.setText(Double.toString(pizza.getPrecoP()));
			}
		});
		BoxPz1.setBounds(394, 111, 148, 22);
		BoxPz1.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Quatro queijos", "Calabresa", "Portuguesa", "Mussarela", "Frango com catupiri"}));
		BoxPz1.setToolTipText("");
		frame.getContentPane().add(BoxPz1);
		
		JComboBox BoxPz2 = new JComboBox();
		BoxPz2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaPizzas popula = new PopulaPizzas();
				Pizzas pizza = popula.buscaPizzas(popula.populaArray(), BoxPz2.getSelectedItem().toString());
				valorP.setText(Double.toString(pizza.getPrecoP()));
			}
		});
		BoxPz2.setBounds(394, 144, 148, 22);
		BoxPz2.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Quatro queijos", "Calabresa", "Portuguesa", "Mussarela", "Frango com catupiri"}));
		BoxPz2.setToolTipText("");
		frame.getContentPane().add(BoxPz2);
				
		JComboBox BoxPz3 = new JComboBox();
		BoxPz3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaPizzas popula = new PopulaPizzas();
				Pizzas pizza = popula.buscaPizzas(popula.populaArray(), BoxPz3.getSelectedItem().toString());
				valorP.setText(Double.toString(pizza.getPrecoP()));
			}
		});
		BoxPz3.setBounds(394, 177, 148, 22);
		BoxPz3.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Quatro queijos", "Calabresa", "Portuguesa", "Mussarela", "Frango com catupiri"}));
		frame.getContentPane().add(BoxPz3);
		
		//==============================================SPINNER=======================================================
		JSpinner spinPzz1 = new JSpinner();
		spinPzz1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinPzz1.getValue());
				int qtdEs = Integer.parseInt(spinPzz1.getValue().toString());
				double valorHamb = Double.parseDouble(valorP.getText());				
				valorAPagar.setText((valorHamb*qtdEs)+" ");
			}
		});
		spinPzz1.setBounds(552, 111, 48, 20);
		frame.getContentPane().add(spinPzz1);
		
		
		JSpinner spinPzz2 = new JSpinner();
		spinPzz2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinPzz2.getValue());
				int qtdEs = Integer.parseInt(spinPzz2.getValue().toString());
				String valorHa = valorP.getText();
				double valorHamb = Double.parseDouble(valorHa);				
				valorAPagar.setText((valorHamb*qtdEs)+" ");
			}
		});
		spinPzz2.setBounds(552, 144, 48, 20);
		frame.getContentPane().add(spinPzz2);
		
		JSpinner spinPzz3 = new JSpinner();
		spinPzz3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinPzz3.getValue());
				int qtdEs = Integer.parseInt(spinPzz3.getValue().toString());
				String valorHa = valorP.getText();
				double valorHamb = Double.parseDouble(valorHa);				
				valorAPagar.setText((valorHamb*qtdEs)+" ");
			}
		});
		spinPzz3.setBounds(553, 177, 48, 20);
		frame.getContentPane().add(spinPzz3);
			
		//--------------------FECHA PIZZA-----------------\\
		//--------------------AREA PARA SOBREMESA-----------------
		JComboBox BoxSob3 = new JComboBox();
		BoxSob3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaSobremesa popula = new PopulaSobremesa();
				Sobremesa sobremesa = popula.buscaSobremesa(popula.populaArray(), BoxSob3.getSelectedItem().toString());
				valorP.setText(Double.toString(sobremesa.getPrecoS()));
			}
		});
		BoxSob3.setBounds(395, 325, 148, 22);
		BoxSob3.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Sorvete", "Torrada", "Bolo", "Torta"}));
		frame.getContentPane().add(BoxSob3);
		
		JComboBox BoxSob2 = new JComboBox();
		BoxSob2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaSobremesa popula = new PopulaSobremesa();
				Sobremesa sobremesa = popula.buscaSobremesa(popula.populaArray(), BoxSob2.getSelectedItem().toString());
				valorP.setText(Double.toString(sobremesa.getPrecoS()));
			}
		});
		BoxSob2.setBounds(395, 292, 148, 22);
		BoxSob2.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Sorvete", "Torrada", "Bolo", "Torta"}));
		BoxSob2.setToolTipText("");
		frame.getContentPane().add(BoxSob2);
		
		JComboBox BoxSob1 = new JComboBox();
		BoxSob1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopulaSobremesa popula = new PopulaSobremesa();
				Sobremesa sobremesa = popula.buscaSobremesa(popula.populaArray(), BoxSob1.getSelectedItem().toString());
				valorP.setText(Double.toString(sobremesa.getPrecoS()));
			}
		});
		BoxSob1.setBounds(395, 259, 148, 22);
		BoxSob1.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Sorvete", "Torrada", "Bolo", "Torta"}));
		BoxSob1.setToolTipText("");
		frame.getContentPane().add(BoxSob1);
		//==============================================SPINNER=======================================================
		JSpinner spinSm1 = new JSpinner();
		spinSm1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinSm1.getValue());
				int qtdEs = Integer.parseInt(spinSm1.getValue().toString());
				double valorHamb = Double.parseDouble(valorP.getText());	
				String juntos = String.valueOf((valorHamb*qtdEs));
				valorAPagar.setText(juntos);
			}
		});
		spinSm1.setBounds(552, 261, 48, 20);
		frame.getContentPane().add(spinSm1);
		
		
		JSpinner spinSm2 = new JSpinner();
		spinSm2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinSm2.getValue());
				int qtdEs = Integer.parseInt(spinSm2.getValue().toString());
				double valorHamb = Double.parseDouble(valorP.getText());		
				String juntos = String.valueOf((valorHamb*qtdEs));
				valorAPagar.setText(juntos);
			}
		});
		spinSm2.setBounds(552, 294, 48, 20);
		frame.getContentPane().add(spinSm2);
		

		JSpinner spinSm3 = new JSpinner();
		spinSm3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinSm3.getValue());
				int qtdEs = Integer.parseInt(spinSm3.getValue().toString());				
				double valorHamb = Double.parseDouble(valorP.getText());	
				String juntos = String.valueOf((valorHamb*qtdEs));
				valorAPagar.setText(juntos);
			}
		});
		spinSm3.setBounds(553, 327, 48, 20);
		frame.getContentPane().add(spinSm3);
		
		
		//--------------------FECHA SOBREMESA-----------------\\
		//--------------------AREA DOS BUTÕES-----------------
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Sua Compra foi enviada para o caixa!");				
			}
		});
		btnComprar.setBounds(139, 437, 130, 40);
		btnComprar.setForeground(new Color(0, 0, 0));
		btnComprar.setBackground(new Color(0, 128, 0));
		btnComprar.setFont(new Font("Arial Black", Font.BOLD, 18));
		frame.getContentPane().add(btnComprar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showConfirmDialog(null, "Sua compra foi cancelada!");
			}
		});
		btnCancelar.setBounds(439, 437, 130, 40);
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(new Color(128, 0, 0));
		btnCancelar.setFont(new Font("Arial Black", Font.BOLD, 18));
		frame.getContentPane().add(btnCancelar);
		
		
		//--------------------FECHA BUTÕES-----------------\\
		//--------------------AREA DE LABEL-----------------
		JLabel lblTipos = new JLabel("TIPOS");
		lblTipos.setBounds(139, 95, 46, 14);
		lblTipos.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTipos);
		
		JLabel lblQtd = new JLabel("QTD.:");
		lblQtd.setBounds(286, 95, 46, 14);
		lblQtd.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblQtd);
		
		JLabel label = new JLabel("QTD.:");
		label.setBounds(289, 243, 46, 14);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("TIPOS");
		label_1.setBounds(140, 243, 46, 14);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_1);
		
		JLabel lblPizzas = new JLabel("PIZZAS");
		lblPizzas.setBounds(439, 62, 115, 26);
		lblPizzas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPizzas.setFont(new Font("Arial Black", Font.BOLD, 18));
		frame.getContentPane().add(lblPizzas);
		
		JLabel lblSobremesa = new JLabel("SOBREMESA");
		lblSobremesa.setBounds(424, 210, 145, 32);
		lblSobremesa.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobremesa.setFont(new Font("Arial Black", Font.BOLD, 18));
		frame.getContentPane().add(lblSobremesa);
		
		JLabel label_2 = new JLabel("QTD.:");
		label_2.setBounds(552, 95, 46, 14);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("TIPOS");
		label_3.setBounds(415, 95, 127, 14);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("QTD.:");
		label_4.setBounds(553, 243, 46, 14);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("TIPOS");
		label_5.setBounds(454, 243, 46, 14);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label_5);
		
		//--------------------FECHA LABEL-----------------\\
		
		//--------------------AREA DA CAIXAS DE TEXTO-----------------
		
		//=========================================VALOR COMIDA===========================
		valorP = new JTextField();
		valorP.setHorizontalAlignment(SwingConstants.CENTER);
		valorP.setFont(new Font("Tahoma", Font.BOLD, 18));
		valorP.setText("Valor");
		valorP.setBounds(179, 375, 130, 40);
		frame.getContentPane().add(valorP);
		valorP.setColumns(10);
			
		
		
		//====================================VALOR TOTAL==================================
		valorAPagar = new JTextField();
		valorAPagar.setText("Valor Total");
		valorAPagar.setHorizontalAlignment(SwingConstants.CENTER);
		valorAPagar.setFont(new Font("Tahoma", Font.BOLD, 18));
		valorAPagar.setColumns(10);
		valorAPagar.setBounds(394, 375, 160, 40);
		frame.getContentPane().add(valorAPagar);
	
		//--------------------FECHA CAIXAS DE TEXTOS-----------------\\
	}
}
