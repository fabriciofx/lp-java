package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int n, a, b, soma;
		String r = "";

		n = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a quantidade de números"));

		a = 1;
		b = 1;

		for (int i = 0; i < n; i++) {
			r = r + a + ", ";
			soma = a + b;
			a = b;
			b = soma;
		}

		JOptionPane.showMessageDialog(null, r);
	}
}
