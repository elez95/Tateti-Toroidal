package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frame;
	
	private JButton[] botones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTatetiToroidal = new JLabel("TATETI TOROIDAL");
		lblTatetiToroidal.setBounds(263, 11, 306, 110);
		lblTatetiToroidal.setFont(new Font("Verdana", Font.BOLD, 28));
		frame.getContentPane().add(lblTatetiToroidal);
		
		JButton button = new JButton("");
		button.setBounds(0, 0, 12, 9);
		frame.getContentPane().add(button);
		
		JPanel tablero = new JPanel();
		tablero.setBackground(Color.LIGHT_GRAY);
		tablero.setBounds(310, 132, 350, 350);
		frame.getContentPane().add(tablero);
		tablero.setLayout(new GridLayout(3, 3, 5, 5));
		
		JButton boton0 = new JButton("X");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton0.setBackground(Color.WHITE);
		tablero.add(boton0);
		
		JButton boton1 = new JButton("X");
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton1.setBackground(Color.WHITE);
		tablero.add(boton1);
		
		JButton boton2 = new JButton("X");
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton2.setBackground(Color.WHITE);
		tablero.add(boton2);
		
		JButton boton3 = new JButton("X");
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton3.setBackground(Color.WHITE);
		tablero.add(boton3);
		
		JButton boton4 = new JButton("X");
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton4.setBackground(Color.WHITE);
		tablero.add(boton4);
		
		JButton boton5 = new JButton("X");
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton5.setBackground(Color.WHITE);
		tablero.add(boton5);
		
		JButton boton6 = new JButton("X");
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton6.setBackground(Color.WHITE);
		tablero.add(boton6);
		
		JButton boton7 = new JButton("X");
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton7.setBackground(Color.WHITE);
		tablero.add(boton7);
		
		JButton boton8 = new JButton("X");
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton8.setBackground(Color.WHITE);
		tablero.add(boton8);
		
	}
}
