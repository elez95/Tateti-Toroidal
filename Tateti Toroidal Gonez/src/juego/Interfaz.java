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
import java.awt.Component;
import java.awt.Cursor;

public class Interfaz {

	Juego juego;
	
	private JPanel tablero;
	
	private JFrame frmTatetiToroidalElias;
	
	private JLabel lblGanador;
	
	private JLabel turnoCruzLabel;
	
	private JLabel turnoCuadradoLabel;
	
	private JLabel ganadorCruz;

	private JLabel ganadorCuadrado;
	private JLabel salirLabel;
	/**
	 * Launch the application.
	 */
	public static void main( String[] args ) {
		
		EventQueue.invokeLater( new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frmTatetiToroidalElias.setVisible( true );
				} catch ( Exception e ) {
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
		frmTatetiToroidalElias.setUndecorated( true );
		frmTatetiToroidalElias.setTitle( "Tateti Toroidal Elias Gonez" );
		frmTatetiToroidalElias.getContentPane().setEnabled( false );
		frmTatetiToroidalElias.setBounds( 100, 100, 800, 600 );
		frmTatetiToroidalElias.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frmTatetiToroidalElias.getContentPane().setLayout( null );
		frmTatetiToroidalElias.setLocationRelativeTo(null);
		
		
		JLabel lblTatetiToroidal = new JLabel( "TATETI TOROIDAL" );
		lblTatetiToroidal.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/TATETI-TOROIDAL.png")));
		lblTatetiToroidal.setBounds( 185, 11, 471, 110 );
		lblTatetiToroidal.setFont( new Font( "Verdana", Font.BOLD, 28 ) );
		frmTatetiToroidalElias.getContentPane().add( lblTatetiToroidal );
		
		
		salirLabel = new JLabel("");

		salirLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				System.exit(0);
			}
		});
		salirLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Salir.png")));
		salirLabel.setBounds(760, 11, 30, 35);
		frmTatetiToroidalElias.getContentPane().add(salirLabel);
		
		ganadorCruz = new JLabel("");
		ganadorCruz.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Ganador-cruz.png")));
		ganadorCruz.setBounds(271, 507, 350, 68);
		frmTatetiToroidalElias.getContentPane().add(ganadorCruz);
		ganadorCruz.setVisible(false);
		
		ganadorCuadrado = new JLabel("");
		ganadorCuadrado.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Ganador-cuadrado.png")));
		ganadorCuadrado.setBounds(271, 507, 350, 68);
		frmTatetiToroidalElias.getContentPane().add(ganadorCuadrado);
		ganadorCuadrado.setVisible(false);
		
		turnoCruzLabel = new JLabel("");
		turnoCruzLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Turno-cruz.png")));
		turnoCruzLabel.setBounds(22, 403, 188, 102);
		frmTatetiToroidalElias.getContentPane().add(turnoCruzLabel);
		
		turnoCuadradoLabel = new JLabel("");
		turnoCuadradoLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Turno-cuadrado.png")));
		turnoCuadradoLabel.setBounds(22, 403, 188, 102);
		frmTatetiToroidalElias.getContentPane().add(turnoCuadradoLabel);
		
		
		tablero = new JPanel();
		tablero.setBackground( new Color( 79, 21, 255 ) );
		tablero.setBounds( 233, 132, 350, 350 );
		frmTatetiToroidalElias.getContentPane().add( tablero );
		tablero.setLayout( new GridLayout( 3, 3, 3, 3 ) );

		//Celdas del tablero------------------------------------------------------------------------------
		
		JButton celda0 = new JButton( "" );
		movimientoCursor( celda0 );
		crearCelda( 0, celda0 );		
		
		
		JButton celda1 = new JButton( "" );
		movimientoCursor( celda1 );
		crearCelda( 1, celda1 );
	
		
		JButton celda2 = new JButton( "" );
		movimientoCursor( celda2 );
		crearCelda( 2, celda2 );
			
		
		JButton celda3 = new JButton( "" );
		movimientoCursor( celda3 );
		crearCelda( 3, celda3 );
		
		
		JButton celda4 = new JButton( "" );
		movimientoCursor( celda4 );
		crearCelda( 4, celda4 );		
		
		
		JButton celda5 = new JButton( "" );
		movimientoCursor( celda5 );
		crearCelda( 5, celda5 );
		
		
		JButton celda6 = new JButton( "" );
		movimientoCursor( celda6 );
		crearCelda( 6, celda6 );
				
		
		JButton celda7 = new JButton( "" );
		movimientoCursor( celda7 );
		crearCelda( 7, celda7 );
			
		
		JButton celda8 = new JButton( "" );
		movimientoCursor( celda8 );
		crearCelda( 8, celda8 );
		
		//------------------------------------------------------------------------------------------------

		
		lblGanador = new JLabel( "" );
		lblGanador.setFont(new Font( "Tahoma", Font.PLAIN, 35 ) );
		lblGanador.setBounds( 402, 523, 230, 28 );
		frmTatetiToroidalElias.getContentPane().add( lblGanador );
		
		JLabel imagenDeFondo = new JLabel( "" );
		imagenDeFondo.setIcon( new ImageIcon( Interfaz.class.getResource( "/imagenes/Fondo.png" ) ) );
		imagenDeFondo.setBounds( 0, 0, 800, 600 );
		frmTatetiToroidalElias.getContentPane().add( imagenDeFondo );
		
	}
	
	//Metodos privados---------------------------------------------------------------------------------------
	private void cargarJugada( int posicion, JButton boton ) 
	{
		if(!juego.verSiHayGanador() ) 
		{
			if(!juego.seRepite(posicion)) {
			if( juego.cargarPosicionEnTablero( posicion ) ) /////
			{
				dibujarImagenCelda(boton);
				dibujarGanador();
			}
			else
			{
				dibujarImagenCelda(boton);
			}
			juego.avanzarTurno();

			dibujarCartelTurno();
			}
		}

	}
	
	
	private void movimientoCursor( JButton boton ) 
	{
		boton.addMouseListener( new MouseAdapter() {
			@Override
			public void mouseExited( MouseEvent arg0 ) 
			{
				boton.setBackground( new Color( 02, 40, 59 ) );
			}
		} );
		
		boton.addMouseMotionListener( new MouseMotionAdapter() {
			@Override
			public void mouseMoved( MouseEvent arg0 )
			{
				boton.setBackground( new Color( 7, 91, 139 ) );
			}
		} );
		
	}
	
	
	private void crearCelda( int posicion, JButton boton ) 
	{
		boton.setFocusPainted(false);
		boton.setBorderPainted(false);
		boton.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) 
			{
				cargarJugada( posicion, boton );
			}
		} );
		boton.setFont( new Font( "Tahoma", Font.PLAIN, 75 ) );
		boton.setBackground( new Color( 02, 40, 59 ));
		tablero.add( boton );
	}
	
	
	private void dibujarImagenCelda( JButton boton ) 
	{
		if(juego.getTurno().equals("CRUZ"))
			boton.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Cruz.png")));
		else
			boton.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Cuadrado.png")));
	}
	
	
	private void dibujarGanador() 
	{
		if(juego.getTurno().equals("CRUZ"))
			ganadorCruz.setVisible(true);
		else
			ganadorCuadrado.setVisible(true);
		
		turnoCruzLabel.setVisible(false);
		turnoCuadradoLabel.setVisible(false);
	}
	
	
	private void dibujarCartelTurno() 
	{
		if(juego.getTurno().equals("CRUZ"))
			turnoCruzLabel.setVisible(true);
		else
			turnoCruzLabel.setVisible(false);
	}
}
