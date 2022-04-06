package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class VBusqueda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textVBusqueda;

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
		setBounds(100, 100, 450, 300);
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
	}

}
