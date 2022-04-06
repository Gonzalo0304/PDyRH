package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;

public class VGesBanda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textCodigoVGesBanda;
	private JTextField textNombreVGesBanda;
	private JTextField textAmbitoVGesBanda;
	private JTextField textFechIniVGesBanda;
	private JTextField textFechFinVGesBanda;
	private JTextField textBandaRelVGesBanda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VGesBanda dialog = new VGesBanda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VGesBanda() {
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
			JButton ButtonModVGesBanda = new JButton("Modificar");
			ButtonModVGesBanda.setBounds(335, 159, 89, 23);
			contentPanel.add(ButtonModVGesBanda);
		}
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setBounds(76, 28, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(76, 53, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u00C1mbito:");
		lblNewLabel_2.setBounds(76, 78, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha inicio:");
		lblNewLabel_3.setBounds(63, 103, 59, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha final:");
		lblNewLabel_4.setBounds(63, 128, 59, 14);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bandas relacionadas:");
		lblNewLabel_5.setBounds(20, 153, 102, 14);
		contentPanel.add(lblNewLabel_5);
		
		textCodigoVGesBanda = new JTextField();
		textCodigoVGesBanda.setBounds(132, 25, 86, 20);
		contentPanel.add(textCodigoVGesBanda);
		textCodigoVGesBanda.setColumns(10);
		
		textNombreVGesBanda = new JTextField();
		textNombreVGesBanda.setBounds(132, 50, 86, 20);
		contentPanel.add(textNombreVGesBanda);
		textNombreVGesBanda.setColumns(10);
		
		textAmbitoVGesBanda = new JTextField();
		textAmbitoVGesBanda.setBounds(132, 75, 86, 20);
		contentPanel.add(textAmbitoVGesBanda);
		textAmbitoVGesBanda.setColumns(10);
		
		textFechIniVGesBanda = new JTextField();
		textFechIniVGesBanda.setBounds(132, 100, 86, 20);
		contentPanel.add(textFechIniVGesBanda);
		textFechIniVGesBanda.setColumns(10);
		
		textFechFinVGesBanda = new JTextField();
		textFechFinVGesBanda.setBounds(132, 125, 86, 20);
		contentPanel.add(textFechFinVGesBanda);
		textFechFinVGesBanda.setColumns(10);
		
		textBandaRelVGesBanda = new JTextField();
		textBandaRelVGesBanda.setBounds(132, 150, 86, 20);
		contentPanel.add(textBandaRelVGesBanda);
		textBandaRelVGesBanda.setColumns(10);
		
		JButton ButtonMasVGesBanda = new JButton("+");
		ButtonMasVGesBanda.setBounds(227, 149, 41, 23);
		contentPanel.add(ButtonMasVGesBanda);
	}
}
