package exemplos.sequencial;

import javax.swing.JOptionPane;

public class CalcularRevestimentoPiscina {
	public static void main(String[] args) {
		double largura, comprimento, altura, area, custo;
		// 1. Solicite na tela que o usuário digite a largura
		// 2. Leia do teclado a largura e guarde-a
		largura = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a largura"));

		// 3. Solicite na tela que o usuário digite o comprimento
		// 4. Leia do teclado o comprimento e guarde-o
		comprimento = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o comprimento"));

		// 5. Solicite na tela que o usuário digite a altura
		// 6. Leia do teclado a altura e guarde-a
		altura = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a altura"));

		// 7. Calcule as áreas da piscina e guarde este resultado
		area = 2 * comprimento * altura + 2 * largura * altura + comprimento
				* largura;

		// 8. Calcule o custo da piscina (R$ 20,00 / m2)
		custo = area * 20;

		// 9 .Mostre o resultado do passo 8
		JOptionPane.showMessageDialog(null, "Custo: R$ " + custo);
	}
}
