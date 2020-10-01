package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
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
import java.awt.Toolkit;

public class Interfaz {

	Juego juego;
	
	private JPanel tablero;
	
	private JFrame frmTatetiToroidalElias;
	
	private JLabel lblGanador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frmTatetiToroidalElias.setVisible(true);
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
		
		frmTatetiToroidalElias = new JFrame();
		frmTatetiToroidalElias.setUndecorated(true);
		//frmTatetiToroidalElias.setContentPane(new JLabel(new ImageIcon("Fondo.png")));
		frmTatetiToroidalElias.setTitle("Tateti Toroidal Elias Gonez");
		frmTatetiToroidalElias.getContentPane().setEnabled(false);
		frmTatetiToroidalElias.setBounds(100, 100, 800, 600);
		frmTatetiToroidalElias.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTatetiToroidalElias.getContentPane().setLayout(null);
		
		
		JLabel lblTatetiToroidal = new JLabel("TATETI TOROIDAL");
		lblTatetiToroidal.setBounds(263, 11, 306, 110);
		lblTatetiToroidal.setFont(new Font("Verdana", Font.BOLD, 28));
		frmTatetiToroidalElias.getContentPane().add(lblTatetiToroidal);
		
		JButton button = new JButton("");
		button.setBounds(0, 0, 12, 9);
		frmTatetiToroidalElias.getContentPane().add(button);
		
		tablero = new JPanel();
		tablero.setBackground(Color.LIGHT_GRAY);
		tablero.setBounds(233, 132, 350, 350);
		frmTatetiToroidalElias.getContentPane().add(tablero);
		tablero.setLayout(new GridLayout(3, 3, 5, 5));
		
		//Botones------------------------------------------------------------------------------
		
		JButton boton0 = new JButton("");
		movimientoCursor(boton0);
		clickSobreBoton(0, boton0);		
		
		
		JButton boton1 = new JButton("");
		movimientoCursor(boton1);
		clickSobreBoton(1, boton1);
	
		
		JButton boton2 = new JButton("");
		movimientoCursor(boton2);
		clickSobreBoton(2, boton2);
			
		
		JButton boton3 = new JButton("");
		movimientoCursor(boton3);
		clickSobreBoton(3, boton3);
		
		
		JButton boton4 = new JButton("");
		movimientoCursor(boton4);
		clickSobreBoton(4, boton4);		
		
		JButton boton5 = new JButton("");
		movimientoCursor(boton5);
		clickSobreBoton(5, boton5);
		
		
		JButton boton6 = new JButton("");
		movimientoCursor(boton6);
		clickSobreBoton(6, boton6);
				
		
		JButton boton7 = new JButton("");
		movimientoCursor(boton7);
		clickSobreBoton(7, boton7);
			
		
		JButton boton8 = new JButton("");
		movimientoCursor(boton8);
		clickSobreBoton(8, boton8);
		
		//------------------------------------------------------------------------------------------------

		
		lblGanador = new JLabel("");
		lblGanador.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblGanador.setBounds(402, 523, 230, 28);
		frmTatetiToroidalElias.getContentPane().add(lblGanador);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Fondo.png")));
		label.setBounds(0, 0, 800, 600);
		frmTatetiToroidalElias.getContentPane().add(label);
		
	}
	
	//Metodos privados---------------------------------------------------------------------------------------
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
	
	
	private void movimientoCursor(JButton boton) 
	{
		boton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				boton.setBackground(Color.WHITE);
			}
		});
		
		boton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0)
			{
				boton.setBackground(Color.LIGHT_GRAY);
			}
		});
		
	}
	
	
	private void clickSobreBoton(int posicion, JButton boton) 
	{
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				jugada(posicion, boton);
			}
		});
		boton.setFont(new Font("Tahoma", Font.PLAIN, 75));
		boton.setBackground(Color.WHITE);
		tablero.add(boton);
	}
}
