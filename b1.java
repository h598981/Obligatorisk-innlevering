package dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String l�nn = showInputDialog("skriv bruttoinntekt: ");
		int bruttoL�nn = parseInt(l�nn);
		int skattefritt = 164100;
		
		double trinn0 = 0.00;
		double trinn1 = 0.0093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		if (bruttoL�nn <= 161100) {
			double skatt = trinn0;
			double trinnskatt = skatt*bruttoL�nn;
			showMessageDialog(null, "skattesats: " + skatt + "\n" + "Trinnskatt: " + trinnskatt + " Nok");
		}
		
		else if (bruttoL�nn > 164100 && bruttoL�nn <= 230950) {
			int skattbarL�nn = bruttoL�nn - skattefritt;
			double trinnskatt = skattbarL�nn * trinn1;
			
			showMessageDialog(null, "Skattesats: " + trinn1 + " \n" + "Trinnskatt:" +  trinnskatt + " Nok ");
		}
		else if (bruttoL�nn > 230950 && bruttoL�nn <= 580650) {
			int skattbarL�nn = bruttoL�nn - skattefritt;
			double trinnSkatt = skattbarL�nn * trinn2;
			
			showMessageDialog(null, "Skattesats: " + trinn2 + "\n" + "Trinnskatt: " + trinnSkatt+ " Nok");
		}
		else if (bruttoL�nn > 580650 && bruttoL�nn <= 934050) {
			int skattbarL�nn = bruttoL�nn - skattefritt;
			double trinnSkatt = skattbarL�nn * trinn3;
			
			showMessageDialog(null, "Skattesats: " + trinn3 + "\n" + "Trinnskatt: " + trinnSkatt +" Nok");
		}
		
		else if (bruttoL�nn > 934050) {
			int skattbarL�nn = bruttoL�nn - skattefritt;
			double trinnSkatt = skattbarL�nn * trinn4;
			
			showMessageDialog(null, "Skattesats: " + trinn4 + "\n" + "Trinnskatt: " + trinnSkatt + " NOk");
			
			
	
		}
		
		 
		
		

	}

}
