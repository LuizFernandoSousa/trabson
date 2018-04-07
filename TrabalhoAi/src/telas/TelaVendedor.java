package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class TelaVendedor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendedor window = new TelaVendedor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaVendedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Finalizar = new JButton("Finalizar");
		Finalizar.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Finalizar.setBackground(Color.GREEN);
		Finalizar.setBounds(103, 264, 138, 43);
		frame.getContentPane().add(Finalizar);
		
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Cancelar.setBackground(Color.RED);
		Cancelar.setBounds(318, 264, 138, 43);
		frame.getContentPane().add(Cancelar);
		
		table = new JTable();
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setBounds(39, 41, 455, 201);
		frame.getContentPane().add(table);
	}
}
