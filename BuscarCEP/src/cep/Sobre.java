package cep;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/3669170_home_ic_icon (1).png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Buscar CEP - ver 1.0");
		lblNewLabel.setBounds(34, 35, 115, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("@Author Raphael Soares");
		lblNewLabel_1.setBounds(34, 70, 126, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("WEB Service:");
		lblNewLabel_2.setBounds(34, 107, 72, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}

		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(new Color(0, 128, 255));
		lblWebService.setBounds(116, 107, 126, 14);
		getContentPane().add(lblWebService);

		JButton btnGithub = new JButton("New button");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/Raphaelcostasoares?tab=repositories");
			}
		});
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/211904_social_github_icon (1).png")));
		btnGithub.setBounds(34, 180, 61, 48);
		getContentPane().add(btnGithub);

	}// fim do construtor
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site); 
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
