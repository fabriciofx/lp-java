package exemplos.sequencial;

import javax.swing.JOptionPane;

public class CalcularSalarioLiquido {
	public static void main(String[] args) {
		// 1. Solicite na tela que o usuário digite o salario
		// 2. Leia do teclado o salario e guarde-o
		double salario = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o sal�rio"));

		// 3. Calcule o imposto de 9% em cima do salário e guarde-o
		double inss = salario * 0.09;

		// 4. Subtraia do salário bruto o imposto e guarde o resultado
		double salarioLiquido = salario - inss;

		// 5. Mostre na tela o resultado do passo 4
		JOptionPane.showMessageDialog(null, "O salário líquido é de: R$ "
				+ salarioLiquido);
	}
}
