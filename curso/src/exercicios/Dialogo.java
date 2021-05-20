package exercicios;

import javax.swing.JOptionPane;

public class Dialogo {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		
		
		JOptionPane.showMessageDialog(null, "Hello, World!");
		
		
		
		System.out.println("Hello " + name);
		System.exit(0);
	}

}
