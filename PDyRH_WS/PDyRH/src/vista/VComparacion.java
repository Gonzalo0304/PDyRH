package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.JRadioButton;

public class VComparacion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VComparacion dialog = new VComparacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VComparacion() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(319, 227, 105, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Comprobar sel.");
		btnNewButton_1.setBounds(319, 198, 105, 23);
		contentPanel.add(btnNewButton_1);
		
		JRadioButton RadioButton1VComparacion = new JRadioButton("");
		RadioButton1VComparacion.setBounds(129, 75, 109, 23);
		contentPanel.add(RadioButton1VComparacion);
		
		JRadioButton RadioButton2VComparacion = new JRadioButton("");
		RadioButton2VComparacion.setBounds(129, 101, 109, 23);
		contentPanel.add(RadioButton2VComparacion);
		
		JRadioButton RadioButton3VComparacion = new JRadioButton("");
		RadioButton3VComparacion.setBounds(129, 161, 109, 23);
		contentPanel.add(RadioButton3VComparacion);
		
		JRadioButton RadioButton4VComparacion = new JRadioButton("");
		RadioButton4VComparacion.setBounds(129, 187, 109, 23);
		contentPanel.add(RadioButton4VComparacion);
	}
}
