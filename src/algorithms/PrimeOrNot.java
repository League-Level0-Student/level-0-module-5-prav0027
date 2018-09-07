package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Give me a number.");
	int num = Integer.parseInt(number);
	for(int i=2; i<num; i++) {
	if(num%i==0) {
		JOptionPane.showMessageDialog(null, "Your number is not prime.");
		System.exit(0);
	}
	}
JOptionPane.showMessageDialog(null, "Your number is prime.");
}
}
