package exemplos.sequencial;

import javax.swing.JOptionPane;

public class MultDoisESeteInvertido {
	public static void main(String[] args) {
		int a, b;
		String numeros = "";
		
		a = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o número inicial"));
		b = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o número final"));
		
		for (int i = b; i >= a; i--) {
			if (i % 5 == 0 || i % 7 == 0) {
				numeros = numeros + i + ", ";
			}
		}
		
		JOptionPane.showMessageDialog(null, numeros);
	}
}
