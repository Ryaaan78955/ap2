package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import controller.mainMVC;

import java.awt.List;
import java.sql.SQLException;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_Catalogue {

	private JFrame frame;
	private JTable table;



	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public View_Catalogue() throws ClassNotFoundException, SQLException {
		mainMVC.getM().getall();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		List list_livre = new List();
		list_livre.setBounds(35, 94, 498, 202);
		frame.getContentPane().add(list_livre);


		
		
		JButton btnNewButton = new JButton("Retour Catalogue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(35, 24, 152, 42);
		frame.getContentPane().add(btnNewButton);


		for(int i=0 ; i!=mainMVC.getM().getListLivre().size();i++)
		{
			list_livre.add(mainMVC.getM().getListLivre().get(i).LigneInfo());

		}

	}
}
