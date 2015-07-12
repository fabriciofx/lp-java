package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class NumeroPerfeito {
	public static void main(String[] args) {
		int n, soma = 0;

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				soma = soma + i;
			}
		}

		if (soma == n) {
			JOptionPane.showMessageDialog(null, n + " é perfeito!");
		} else {
			JOptionPane.showMessageDialog(null, n + " não é perfeito!");
		}
	}
}
