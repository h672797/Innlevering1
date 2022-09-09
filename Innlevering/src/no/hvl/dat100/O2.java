package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	
	public static void main(String[] args) {
 
	for (int i=1; i<=10; i++) {
		String tallTxt = showInputDialog("Poengsum:");
		int poengsum = parseInt(tallTxt);
		
		if (poengsum >= 0 && poengsum <= 39) 
			System.out.println("F");
		
		else if (poengsum >= 40 && poengsum <= 49) 
			System.out.println("E");
		
		else if (poengsum >= 50 && poengsum <= 59) 
			System.out.println("D");
			
		else if (poengsum >= 60 && poengsum <= 79) 
			System.out.println("C");
		
		else if (poengsum >= 80 && poengsum <= 89) 
			System.out.println("B");
			
		else if (poengsum >= 90 && poengsum <= 100) 
			System.out.println("A");
			
		else {
			showMessageDialog(null, "Ugylidg poengsum, prøv igjen");
			i--;
		}
		
			
		
		}
	}
}
