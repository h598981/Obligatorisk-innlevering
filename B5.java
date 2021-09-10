package dat100;

import static javax.swing.JOptionPane.*;

public class B5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x = 1 ;x<=10 ;x++ ) {
		
		String poeng = showInputDialog("poengsum");
		int sum = Integer.parseInt(poeng);
		
		if (sum <=39 && sum >= 0) {
			showMessageDialog(null, "Du har dessverre strøket, karakter F!");
		}
		else if (sum <=49 && sum >=40) {
			showMessageDialog(null, "Beståkarakter! Du fikk en E");
		}
		else if (sum <=59 && sum >=50) {
			showMessageDialog(null, "Helt ok! karakter D");
		}
		else if (sum <=79 && sum >=60) {
			showMessageDialog(null, "Bra! Karakter C");
		}
		else if (sum <=89 && sum >=80) {
			showMessageDialog(null, "Veldig bra! Karakter B");
		}
		else if (sum <=100 && sum >=90) {
			showMessageDialog(null, "Toppkarakter! Du fikk A");
		}
		else {
				showMessageDialog(null, "Ugyldig verdi, prøv igjen");
				x--;
			}
		}
	}				
}