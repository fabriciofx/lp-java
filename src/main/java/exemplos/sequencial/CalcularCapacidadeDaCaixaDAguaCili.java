package exemplos.sequencial;

import javax.swing.JOptionPane;

public class CalcularCapacidadeDaCaixaDAguaCili {
	public static void main(String[] args) {
		// 1. Solicite na tela que o usuário digite o diâmetro
		// 2. Leia do teclado o diâmetro e guarde-o
		double diametro = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o diâmetro"));

		// 3. Solicite na tela que o usuário digite a altura
		// 4. Leia do teclado a altura e guarde-a
		double altura = Double.parseDouble(JOptionPane
				.showInputDialog("Digite altura"));

		// 5. Divida o diâmetro por dois e guarde este resultado
		double raio = diametro / 2;

		// 6. Multiplique o resultado do passo 5 por ele mesmo,
		// depois, multiplique por 3.14 e pela altura e guarde o
		// resultado
		double volume = raio * raio * 3.14 * altura;

		// 7. Pegue o resultado do passo 6 e multiplique por 1.000
		// e guarde reste resultado
		double capacidade = volume * 1000;

		// 8. Mostre na tela o resultado do passo 7
		JOptionPane.showMessageDialog(null, "A capacidade é de: " + capacidade
				+ " litros");
	}
}
