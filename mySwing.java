package com.controle.impl;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class mySwing {
	
	private static void placeComponents(JPanel panel)
	{
		panel.setLayout(null);
		JLabel userLabel1 = new JLabel("First Name");
		userLabel1.setBounds(10,20,80,25);
		panel.add(userLabel1);
		JLabel userLabel2 = new JLabel("Last Name");
		userLabel2.setBounds(10,50,100,25);
		panel.add(userLabel2);
		JLabel userLabel3 = new JLabel("Email ID");
		userLabel3.setBounds(10,80,80,25);
		panel.add(userLabel3);
		JLabel userLabel4 = new JLabel("Phone No.");
		userLabel4.setBounds(10,110,80,25);
		panel.add(userLabel4);
		JTextField fname = new JTextField(20);
		fname.setBounds(100,50,165,25);
		panel.add(fname);
		JTextField lName = new JTextField(20);
		lName.setBounds(100,20,165,25);
		panel.add(lName);
		JTextField email = new JTextField(20);
		email.setBounds(100,80,165,25);
		panel.add(email);
		JTextField phNO = new JTextField(20);
		phNO.setBounds(100,110,165,25);
		panel.add(phNO);
		JButton loginButton = new JButton("Register");
		loginButton.setBounds(10, 160, 80, 25);
		panel.add(loginButton);
		JButton clearButton = new JButton("clear");
		clearButton.setBounds(100, 160, 80, 25);
	     panel.add(clearButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JFrame frame = new JFrame("Student Registration");
			frame.setSize(550, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();
			frame.add(panel);
			placeComponents(panel);
			frame.setVisible(true);

	}

}
