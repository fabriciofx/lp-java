package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class Fatorial {
	public static void main(String[] args) {
		int n, fatorial = 1;

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}

		JOptionPane.showMessageDialog(null, fatorial);
	}
}
