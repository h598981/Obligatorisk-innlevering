package dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lønn = showInputDialog("skriv bruttoinntekt: ");
		int bruttoLønn = parseInt(lønn);
		int skattefritt = 164100;
		
		double trinn0 = 0.00;
		double trinn1 = 0.0093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		if (bruttoLønn <= 161100) {
			double skatt = trinn0;
			double trinnskatt = skatt*bruttoLønn;
			showMessageDialog(null, "skattesats: " + skatt + "\n" + "Trinnskatt: " + trinnskatt + " Nok");
		}
		
		else if (bruttoLønn > 164100 && bruttoLønn <= 230950) {
			int skattbarLønn = bruttoLønn - skattefritt;
			double trinnskatt = skattbarLønn * trinn1;
			
			showMessageDialog(null, "Skattesats: " + trinn1 + " \n" + "Trinnskatt:" +  trinnskatt + " Nok ");
		}
		else if (bruttoLønn > 230950 && bruttoLønn <= 580650) {
			int skattbarLønn = bruttoLønn - skattefritt;
			double trinnSkatt = skattbarLønn * trinn2;
			
			showMessageDialog(null, "Skattesats: " + trinn2 + "\n" + "Trinnskatt: " + trinnSkatt+ " Nok");
		}
		else if (bruttoLønn > 580650 && bruttoLønn <= 934050) {
			int skattbarLønn = bruttoLønn - skattefritt;
			double trinnSkatt = skattbarLønn * trinn3;
			
			showMessageDialog(null, "Skattesats: " + trinn3 + "\n" + "Trinnskatt: " + trinnSkatt +" Nok");
		}
		
		else if (bruttoLønn > 934050) {
			int skattbarLønn = bruttoLønn - skattefritt;
			double trinnSkatt = skattbarLønn * trinn4;
			
			showMessageDialog(null, "Skattesats: " + trinn4 + "\n" + "Trinnskatt: " + trinnSkatt + " NOk");
			
			
	
		}
		
		 
		
		

	}

}
