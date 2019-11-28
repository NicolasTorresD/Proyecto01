package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class FrameCombate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCombate frame = new FrameCombate();
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
	public FrameCombate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Huir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(322, 217, 102, 33);
		contentPane.add(btnNewButton);
		
		JButton btnObjetos = new JButton("Objetos");
		btnObjetos.setBounds(219, 217, 102, 33);
		contentPane.add(btnObjetos);
		
		JButton btnCombate = new JButton("Combate");
		btnCombate.setBounds(219, 183, 102, 33);
		contentPane.add(btnCombate);
		
		JButton btnBloquear = new JButton("Bloquear");
		btnBloquear.setBounds(322, 183, 102, 33);
		contentPane.add(btnBloquear);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 183, 209, 67);
		contentPane.add(textPane);
	}
}
