package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class NumeroPerfeitoEntreDoisNumeros {
	public static void main(String[] args) {
		int a, b;
		String perfeitos = "";

		a = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número inicial"));
		b = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número final"));

		for (int n = a; n <= b; n++) {
			int soma = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					soma = soma + i;
				}
			}

			if (soma == n) {
				perfeitos = perfeitos + n + " ";
			}
		}

		JOptionPane.showMessageDialog(null, "Perfeitos: " + perfeitos);
	}
}
