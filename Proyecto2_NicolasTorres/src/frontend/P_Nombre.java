package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P_Nombre extends JFrame {

	private JPanel contentPane;
	private JTextField txtArk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_Nombre frame = new P_Nombre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P_Nombre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarNombre = new JLabel("Ingresar nombre.");
		lblIngresarNombre.setBounds(30, 42, 104, 14);
		contentPane.add(lblIngresarNombre);
		
		txtArk = new JTextField();
		txtArk.setText("Ark");
		txtArk.setBounds(30, 67, 86, 20);
		contentPane.add(txtArk);
		txtArk.setColumns(10);
		
		JLabel lblSeleccionarClase = new JLabel("Seleccionar clase");
		lblSeleccionarClase.setBounds(31, 98, 123, 14);
		contentPane.add(lblSeleccionarClase);
		
		JButton btnNewButton = new JButton("Guerrero");
		btnNewButton.setBounds(27, 123, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Asesino");
		btnNewButton_1.setBounds(126, 123, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Arquero");
		btnNewButton_2.setBounds(225, 123, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Mago");
		btnNewButton_3.setBounds(324, 123, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sacerdote");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(30, 157, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblbienvenido = new JLabel("========Bienvenido=============");
		lblbienvenido.setBounds(30, 11, 228, 14);
		contentPane.add(lblbienvenido);
		
		JButton btnVolverALa = new JButton("Volver a la pantalla de titulo");
		btnVolverALa.setBounds(295, 227, 118, 23);
		contentPane.add(btnVolverALa);
	}
}
