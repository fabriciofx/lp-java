package exemplos.funcoes_e_procedimentos;

import javax.swing.JOptionPane;

public class CalculadoraComFuncao {
	public static double fazOperacao(char operacao) {
		double n1, n2;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2"));

		switch (operacao) {
		case '+':
			return n1 + n2;
		case '-':
			return n1 - n2;
		case '*':
			return n1 * n2;
		case '/':
			if (n2 == 0) {
				JOptionPane.showMessageDialog(null, "Não dividiras por zero!");
				return 0.0;
			}
			return n1 / n2;
		}

		return 0.0;
	}

	public static void main(String[] args) {
		int opcao;

		do {
			opcao = Integer.parseInt(JOptionPane
					.showInputDialog("Escolha a opção:\n" + "1) Somar\n"
							+ "2) Subtrair\n" + "3) Multiplicar\n"
							+ "4) Dividir\n" + "0) Sair"));
			switch (opcao) {
			case 1:
				JOptionPane.showMessageDialog(null, fazOperacao('+'));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, fazOperacao('-'));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, fazOperacao('*'));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, fazOperacao('/'));
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (opcao != 0);
	}
}
