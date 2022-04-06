package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VGesPersona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textDNIVGesPersona;
	private JTextField textNombreVGesPersona;
	private JTextField textApellidoVGesPersona;
	private JTextField textTelfMovilVGesPersona;
	private JTextField textTelfOpVGesPersona;
	private JTextField textLocalidadVGesPersona;
	private JTextField textNacVGesPersona;
	private JTextField textFalleVGesPersona;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VGesPersona dialog = new VGesPersona();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VGesPersona() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton ButtonVolverVGesBanda = new JButton("Volver");
			ButtonVolverVGesBanda.setBounds(335, 227, 89, 23);
			contentPanel.add(ButtonVolverVGesBanda);
		}
		{
			JButton ButtonBajaVGesBanda = new JButton("Dar baja");
			ButtonBajaVGesBanda.setBounds(335, 193, 89, 23);
			contentPanel.add(ButtonBajaVGesBanda);
		}
		{
			JButton ButtonModificarVGesBanda = new JButton("Modificar");
			ButtonModificarVGesBanda.setBounds(335, 159, 89, 23);
			contentPanel.add(ButtonModificarVGesBanda);
		}
		{
			JLabel lblNewLabel = new JLabel("DNI:");
			lblNewLabel.setBounds(92, 29, 28, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nombre:");
			lblNewLabel_1.setBounds(74, 54, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Apellido:");
			lblNewLabel_2.setBounds(74, 79, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Telefono movil:");
			lblNewLabel_3.setBounds(47, 104, 73, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Telefono opcional:");
			lblNewLabel_4.setBounds(31, 129, 89, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Localidad:");
			lblNewLabel_5.setBounds(72, 154, 48, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Nacimiento:");
			lblNewLabel_6.setBounds(64, 179, 56, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JLabel lblNewLabel_7 = new JLabel("Fallecimiento:");
			lblNewLabel_7.setBounds(55, 204, 65, 14);
			contentPanel.add(lblNewLabel_7);
		}
		{
			textDNIVGesPersona = new JTextField();
			textDNIVGesPersona.setBounds(130, 26, 86, 20);
			contentPanel.add(textDNIVGesPersona);
			textDNIVGesPersona.setColumns(10);
		}
		{
			textNombreVGesPersona = new JTextField();
			textNombreVGesPersona.setBounds(130, 51, 86, 20);
			contentPanel.add(textNombreVGesPersona);
			textNombreVGesPersona.setColumns(10);
		}
		{
			textApellidoVGesPersona = new JTextField();
			textApellidoVGesPersona.setBounds(130, 76, 86, 20);
			contentPanel.add(textApellidoVGesPersona);
			textApellidoVGesPersona.setColumns(10);
		}
		{
			textTelfMovilVGesPersona = new JTextField();
			textTelfMovilVGesPersona.setBounds(130, 101, 86, 20);
			contentPanel.add(textTelfMovilVGesPersona);
			textTelfMovilVGesPersona.setColumns(10);
		}
		{
			textTelfOpVGesPersona = new JTextField();
			textTelfOpVGesPersona.setBounds(130, 126, 86, 20);
			contentPanel.add(textTelfOpVGesPersona);
			textTelfOpVGesPersona.setColumns(10);
		}
		{
			textLocalidadVGesPersona = new JTextField();
			textLocalidadVGesPersona.setBounds(130, 151, 86, 20);
			contentPanel.add(textLocalidadVGesPersona);
			textLocalidadVGesPersona.setColumns(10);
		}
		{
			textNacVGesPersona = new JTextField();
			textNacVGesPersona.setBounds(130, 176, 86, 20);
			contentPanel.add(textNacVGesPersona);
			textNacVGesPersona.setColumns(10);
		}
		{
			textFalleVGesPersona = new JTextField();
			textFalleVGesPersona.setBounds(130, 201, 86, 20);
			contentPanel.add(textFalleVGesPersona);
			textFalleVGesPersona.setColumns(10);
		}
	}

}
