package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Bruttolønn:");
		int bruttolønn = parseInt(tallTxt);
		System.out.println("Bruttolønn:" + "" + bruttolønn + "kr");
		
		if (bruttolønn <= 164100)
			System.out.println("Inntekt:"+ "" + bruttolønn + "kr");
		
		else if (bruttolønn >= 164101 && bruttolønn <= 230950) {
			double trinnskatt01 = 0.93*bruttolønn/100;
				System.out.println("Trinnskatt:"+ "" + trinnskatt01 + "kr");
			double inntekt01 = bruttolønn-trinnskatt01;
				System.out.println("Inntekt:" + "" + inntekt01 + "kr");
		}
		
		else if (bruttolønn >= 230951 && bruttolønn <= 580650) {
			double trinnskatt02 = 2.41*bruttolønn/100;
				System.out.println("Trinnskatt:"+ "" + trinnskatt02 + "kr");
			double inntekt02 = bruttolønn-trinnskatt02;
				System.out.println("Inntekt:" + "" + inntekt02 + "kr");
		}
		
		else if (bruttolønn >= 580651 && bruttolønn <= 934050) {
			double trinnskatt03 = 11.52*bruttolønn/100;
				System.out.println("Trinnskatt:"+ "" + trinnskatt03 + "kr");
			double inntekt03 = bruttolønn-trinnskatt03;
				System.out.println("Inntekt:" + "" + inntekt03 + "kr");
		}
		
		else if (bruttolønn >= 934051) {
			double trinnskatt04 = 14.52*bruttolønn/100;
				System.out.println("Trinnskatt:"+ "" + trinnskatt04 + "kr");
			double inntekt04 = bruttolønn-trinnskatt04;
				System.out.println("Inntekt:" + "" + inntekt04 + "kr"); 
		}
	}

}

