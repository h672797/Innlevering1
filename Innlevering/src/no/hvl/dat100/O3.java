package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Gi et heltall:");
		int n = parseInt(tallTxt);
		
		int sum =1;
		
		for(int i=n; i>0; i--) {
			sum*=i;
		}
		
		System.out.println(sum);
			
	
	}

}

