package dat100;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		String input = showInputDialog("Skriv et tall for å regene fakultet:");
		int tall = Integer.parseInt(input);
		int n = 1;
		
		for (int i=tall; i >=1; i--) {
			n *= i;
		}
		
		System.out.println(n);
		
		
		
	}

}
