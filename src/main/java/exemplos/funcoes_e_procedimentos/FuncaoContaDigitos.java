package exemplos.funcoes_e_procedimentos;

import javax.swing.JOptionPane;

public class FuncaoContaDigitos {
	public static int contaDigitos(int n) {
		int digitos = 0;

		do {
			n = n / 10;
			digitos++;
		} while (n > 0);

		return digitos;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane
				.showInputDialog("Digite um número"));
		JOptionPane.showMessageDialog(null, contaDigitos(n));
	}
}
