package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VBusqueda extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private JTextField textVBusqueda;

	private JTextField textIdentificador;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VBusqueda dialog = new VBusqueda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VBusqueda() {
		setTitle("Introducir Identificador");
		setBounds(100, 100, 465, 327);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		{
			JButton ButtonListadoCrimVBusqueda = new JButton("Listado criminales");
			ButtonListadoCrimVBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 14));
			ButtonListadoCrimVBusqueda.setBounds(10, 227, 137, 23);
			contentPanel.add(ButtonListadoCrimVBusqueda);
		}
		{
			JButton ButtonVolverVBusqueda = new JButton("Volver");
			ButtonVolverVBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 14));
			ButtonVolverVBusqueda.setBounds(335, 227, 89, 23);
			contentPanel.add(ButtonVolverVBusqueda);
		}
		{
			JButton ButtonBuscarVBusqueda = new JButton("Buscar");
			ButtonBuscarVBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 14));
			ButtonBuscarVBusqueda.setEnabled(false);
			ButtonBuscarVBusqueda.setBounds(182, 155, 89, 23);
			contentPanel.add(ButtonBuscarVBusqueda);
		}
		{
			textVBusqueda = new JTextField();
			textVBusqueda.setBounds(193, 113, 205, 20);
			contentPanel.add(textVBusqueda);
			textVBusqueda.setColumns(10);
		}
		{
			JLabel LabelVBusqueda = new JLabel("Introduce el identificador:");
			LabelVBusqueda.setBounds(53, 116, 144, 14);
			contentPanel.add(LabelVBusqueda);
		}
		{
			JRadioButton RadioButtonPersonaVBusqueda = new JRadioButton("Persona");
			RadioButtonPersonaVBusqueda.setSelected(true);
			RadioButtonPersonaVBusqueda.setBounds(22, 20, 87, 23);
			contentPanel.add(RadioButtonPersonaVBusqueda);
		}
		{
			JRadioButton RadioButtonRHVBusqueda = new JRadioButton("Resto Humano");
			RadioButtonRHVBusqueda.setBounds(111, 20, 109, 23);
			contentPanel.add(RadioButtonRHVBusqueda);
		}
		{
			JRadioButton RadioButtonBandaVBusqueda = new JRadioButton("Banda");
			RadioButtonBandaVBusqueda.setBounds(232, 20, 68, 23);
			contentPanel.add(RadioButtonBandaVBusqueda);
		}
		{
			JRadioButton RadioButtonCasoVBusqueda = new JRadioButton("Caso");
			RadioButtonCasoVBusqueda.setBounds(319, 20, 109, 23);
			contentPanel.add(RadioButtonCasoVBusqueda);
		}

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 463, 37);
		menuBar.setBorderPainted(false);
		menuBar.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		contentPanel.add(menuBar);
		
		JMenu menuInsertar = new JMenu("Insertar");
		menuInsertar.setHorizontalAlignment(SwingConstants.LEFT);
		menuInsertar.setFont(new Font("Dialog", Font.PLAIN, 14));
		menuInsertar.setBackground(new Color(0, 0, 255));
		menuInsertar.setForeground(Color.BLACK);
		menuBar.add(menuInsertar);
		
		JMenu menuGestionar = new JMenu("Gestionar");
		menuGestionar.setHorizontalAlignment(SwingConstants.LEFT);
		menuGestionar.setFont(new Font("Dialog", Font.PLAIN, 14));
		menuGestionar.setBackground(new Color(0, 0, 255));
		menuGestionar.setForeground(Color.BLACK);
		menuBar.add(menuGestionar);
		
		JMenu menuComparar = new JMenu("Comparar");
		menuComparar.setHorizontalAlignment(SwingConstants.LEFT);
		menuComparar.setFont(new Font("Dialog", Font.PLAIN, 14));
		menuComparar.setBackground(new Color(0, 0, 255));
		menuComparar.setForeground(Color.BLACK);
		menuBar.add(menuComparar);
		
		JMenuItem mTotal = new JMenuItem("Total");
		mTotal.setHorizontalAlignment(SwingConstants.LEFT);
		mTotal.setBackground(new Color(32, 178, 170));
		mTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mTotal.setForeground(Color.BLACK);
		menuComparar.add(mTotal);
		
		JMenuItem mEspecifico = new JMenuItem("Especifico");
		mEspecifico.setHorizontalAlignment(SwingConstants.LEFT);
		mEspecifico.setBackground(new Color(32, 178, 170));
		mEspecifico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mEspecifico.setForeground(Color.BLACK);
		menuComparar.add(mEspecifico);
		
		JMenu menuBusqueda = new JMenu("Busqueda");
		menuBusqueda.setHorizontalAlignment(SwingConstants.LEFT);
		menuBusqueda.setFont(new Font("Dialog", Font.PLAIN, 14));
		menuBusqueda.setBackground(new Color(0, 0, 255));
		menuBusqueda.setForeground(Color.BLACK);
		menuBar.add(menuBusqueda);
		
		JMenu menUsuario = new JMenu("Usuario");
		menuBar.add(menUsuario);
		menUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		menUsuario.setFont(new Font("Dialog", Font.PLAIN, 14));
		menUsuario.setBackground(new Color(0, 0, 255));
		menUsuario.setForeground(Color.BLACK);
		
		JMenuItem mCerrar = new JMenuItem("Cerrar Sesion");
		mCerrar.setHorizontalAlignment(SwingConstants.TRAILING);
		mCerrar.setBackground(new Color(32, 178, 170));
		mCerrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mCerrar.setForeground(Color.BLACK);
		menUsuario.add(mCerrar);
		
		JRadioButton rdbtnPersona = new JRadioButton("Persona");
		rdbtnPersona.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPersona.setBounds(10, 44, 85, 23);
		contentPanel.add(rdbtnPersona);
		
		JRadioButton rdbtnRestoHumano = new JRadioButton("Resto Humano");
		rdbtnRestoHumano.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnRestoHumano.setBounds(107, 44, 109, 23);
		contentPanel.add(rdbtnRestoHumano);
		
		JRadioButton rdbtnBanda = new JRadioButton("Banda");
		rdbtnBanda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnBanda.setBounds(236, 44, 74, 23);
		contentPanel.add(rdbtnBanda);
		
		JRadioButton rdbtnCaso = new JRadioButton("Caso");
		rdbtnCaso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnCaso.setBounds(319, 44, 74, 23);
		contentPanel.add(rdbtnCaso);
		
		JLabel lblNewLabel = new JLabel("Introduce el Identificador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(21, 120, 175, 14);
		contentPanel.add(lblNewLabel);
		
		textIdentificador = new JTextField();
		textIdentificador.setBounds(206, 116, 187, 23);
		contentPanel.add(textIdentificador);
		textIdentificador.setColumns(10);
		
		JButton btnListado = new JButton("Listado de Criminales");
		btnListado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnListado.setBounds(10, 246, 155, 31);
		contentPanel.add(btnListado);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVolver.setBounds(350, 246, 89, 31);
		contentPanel.add(btnVolver);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscar.setBounds(178, 172, 89, 31);
		contentPanel.add(btnBuscar);

	}
}
