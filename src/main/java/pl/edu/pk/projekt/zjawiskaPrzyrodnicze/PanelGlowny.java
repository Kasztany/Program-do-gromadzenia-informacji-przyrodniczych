package pl.edu.pk.projekt.zjawiskaPrzyrodnicze;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Canvas;

public class PanelGlowny extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelGlowny frame = new PanelGlowny();
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
	public PanelGlowny() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(12, 12, 426, 251);
		contentPane.add(verticalStrut);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(281, 30, 100, 100);
		contentPane.add(canvas);
	}
}
