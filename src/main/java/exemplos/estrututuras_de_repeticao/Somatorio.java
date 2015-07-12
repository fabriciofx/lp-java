package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class Somatorio {
	public static void main(String[] args) {
		int n, soma = 0;

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		for (int i = 1; i <= n; i++) {
			soma = soma + i;
		}

		JOptionPane.showMessageDialog(null, soma);
	}
}
