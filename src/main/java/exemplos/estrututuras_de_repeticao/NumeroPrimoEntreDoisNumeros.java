package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class NumeroPrimoEntreDoisNumeros {
	public static void main(String[] args) {
		int a, b;
		boolean ehPrimo;
		String primos = "";

		a = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número inicial"));
		b = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número final"));

		for (int n = a; n <= b; n++) {
			ehPrimo = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					ehPrimo = false;
					break;
				}
			}

			if (ehPrimo) {
				primos = primos + n + " ";
			}
		}

		JOptionPane.showMessageDialog(null, "Os primos são: " + primos);
	}
}
