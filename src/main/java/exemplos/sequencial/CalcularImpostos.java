package exemplos.sequencial;

import javax.swing.JOptionPane;

public class CalcularImpostos {
	public static void main(String[] args) {
		double precoProduto, icms, cofins, precoFinal;

		// 1. Solicite na tela que o usuário digite o preço do produto
		// 2. Leia do teclado o preço do produto e guarde-o
		precoProduto = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o preço do produto"));

		// 3. Calcule o icms, multiplicando 0.15 (15%) ao preço do
		// produto, depois guarde este resultado
		icms = precoProduto * 0.15;

		// 4. Calcule o cofins, multiplicando 0.07 (7%) ao preço do
		// produto, depois guarde este resultado
		cofins = precoProduto * 0.07;

		// 5. Some o preço do produto, com os resultados dos passos
		// 3 e 4, depois guarde este resultado
		precoFinal = precoProduto + icms + cofins;

		// 6. Mostre na tela o resultado do passo 5
		JOptionPane.showMessageDialog(null, "Preço final: R$ " + precoFinal);
	}
}
