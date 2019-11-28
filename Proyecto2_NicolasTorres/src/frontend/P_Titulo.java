package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class P_Titulo extends JFrame {

	private JPanel contentPane;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_Titulo frame = new P_Titulo();
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
	public P_Titulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setBounds(160, 144, 104, 44);
		contentPane.add(btnNewButton);
		
		btnSalir = new JButton("Salir");
		btnSalir.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
			}
		});
		btnSalir.setBounds(170, 200, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblTerranigma = new JLabel("Terranigma");
		lblTerranigma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTerranigma.setBounds(131, 34, 170, 99);
		contentPane.add(lblTerranigma);
	}
}
