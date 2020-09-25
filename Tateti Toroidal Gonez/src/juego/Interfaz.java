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
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Interfaz {

	 Juego juego;
	
	private JFrame frame;
	
	private JLabel lblGanador;

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
		juego = new Juego();
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
		tablero.setBounds(233, 132, 350, 350);
		frame.getContentPane().add(tablero);
		tablero.setLayout(new GridLayout(3, 3, 5, 5));
		
		
		JButton boton0 = new JButton("");
		boton0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				boton0.setBackground(Color.WHITE);
			}
		});
		boton0.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0)
			{
				boton0.setBackground(Color.LIGHT_GRAY);
			}
		});
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(0);
//				boton0.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(0, boton0);
			}
		});
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton0.setBackground(Color.WHITE);
		tablero.add(boton0);
		
		
		JButton boton1 = new JButton("");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				juego.cargarPosicion(1);
//				boton1.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(1, boton1);
			}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton1.setBackground(Color.WHITE);
		tablero.add(boton1);
		
		
		JButton boton2 = new JButton("");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(2);
//				boton2.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(2, boton2);
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton2.setBackground(Color.WHITE);
		tablero.add(boton2);
		
		
		JButton boton3 = new JButton("");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(3);
//				boton3.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(3, boton3);
			}
		});
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton3.setBackground(Color.WHITE);
		tablero.add(boton3);
		
		
		JButton boton4 = new JButton("");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(4);
//				boton4.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(4, boton4);
			}
		});
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton4.setBackground(Color.WHITE);
		tablero.add(boton4);
		
		
		JButton boton5 = new JButton("");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(5);
//				boton5.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(5, boton5);
			}
		});
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton5.setBackground(Color.WHITE);
		tablero.add(boton5);
		
		
		JButton boton6 = new JButton("");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(6);
//				boton6.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(6, boton6);
			}
		});
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton6.setBackground(Color.WHITE);
		tablero.add(boton6);
		
		
		JButton boton7 = new JButton("");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(7);
//				boton7.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(7, boton7);
			}
		});
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton7.setBackground(Color.WHITE);
		tablero.add(boton7);
		
		
		JButton boton8 = new JButton("");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				juego.cargarPosicion(8);
//				boton8.setText(juego.getTurno());
//				juego.avanzarTurno();
				jugada(8, boton8);
			}
		});
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton8.setBackground(Color.WHITE);
		tablero.add(boton8);
		
		lblGanador = new JLabel("");
		lblGanador.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblGanador.setBounds(402, 523, 230, 28);
		frame.getContentPane().add(lblGanador);
		
	}
	
	private void jugada(int posicion, JButton boton) 
	{
		if(juego.cargarPosicion(posicion))
		{
			boton.setText(juego.getTurno());
			lblGanador.setText("Ganador " + juego.getTurno());
		}
		else
		{
			boton.setText(juego.getTurno());
		}
		juego.avanzarTurno();
	}
}
