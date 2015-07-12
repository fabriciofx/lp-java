package exemplos.sequencial;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {
	public static void main(String[] args) {
		double cotacao, dolar, reais;

		// 1. Solicite na tela que o usuário digite a cotação do USD
		// 2. Leia do teclado a cotação do USD e guarde-a
		cotacao = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a cotação"));

		// 3. Solicite na tela que o usuário digite o valor em USD a ser
		// convertido
		// 4. Leia do teclado o valor em USD a ser convertido e guarde-o
		dolar = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o valor a ser convertido (USD)"));

		// 5. Multiplique o valor em dólares pela cotação
		reais = dolar * cotacao;

		// 6. Mostre na tela o valor em reais
		JOptionPane.showMessageDialog(null, "USD: " + dolar + " são " + reais
				+ " RBL");
	}
}
