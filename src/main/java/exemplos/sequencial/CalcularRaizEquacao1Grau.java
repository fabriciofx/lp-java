package exemplos.sequencial;

import javax.swing.JOptionPane;

public class CalcularRaizEquacao1Grau {
	public static void main(String[] args) {
		double a, b, x;

		// 1. Solicite na tela que o usuário digite o coeficiente a
		// 2. Leia do teclado este coeficiente e guarde-o
		a = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o valor de a (diferente de 0)"));

		if (a == 0) {
			JOptionPane.showMessageDialog(null,
					"O coeficiente a precisa ser diferente de zero!!");
		} else {
			// 3. Solicite na tela que o usuário digite o coeficiente b
			// 4. Leia do teclado este coeficiente e guarde-o
			b = Double.parseDouble(JOptionPane
					.showInputDialog("Digite o valor de b"));

			// 5. Negative o coeficiente b e divida-o por a e guarde este
			// resultado
			x = -b / a;

			// 6. Mostre na tela o resultado do passo 5
			JOptionPane.showMessageDialog(null, "x = " + x);
		}
	}
}
