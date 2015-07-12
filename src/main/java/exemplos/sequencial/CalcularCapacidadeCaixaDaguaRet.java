package exemplos.sequencial;

import javax.swing.JOptionPane;

public class CalcularCapacidadeCaixaDaguaRet {
	public static void main(String[] args) {
		// 1. Solicite na tela que o usuário digite a largura
		// 2. Leia do teclado a largura e guarde-a
		double largura = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a largura"));

		// 3. Solicite na tela que o usuário digite o comprimento
		// 4. Leia do teclado o comprimento e guarde-o
		double comprimento = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o comprimento"));

		// 5. Solicite na tela que o usuário digite a altura
		// 6. Leia do teclado a altura e guarde-a
		double altura = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a altura"));

		// 7. Multiplique a largura, comprimento e altura, e depois
		// multiplique este resultado por 1.000 e guarde-o
		double capacidade = largura * comprimento * altura * 1000;

		// 8. Mostre na tela o resultado do passo 7
		JOptionPane.showMessageDialog(null, "A capacidade é de: " + capacidade
				+ " litros");
	}
}
