package exemplos.sequencial;

import javax.swing.JOptionPane;

public class MediaDuasNotas {
	public static void main(String[] args) {
		double media, nota1, nota2;

		// 1. Solicite na tela que o usuário digite a 1a nota
		// 2. Leia do teclado a 1a nota e guarde-a
		nota1 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a 1a nota"));

		// 3. Solicite na tela que o usuário digite a 2a nota
		// 4. Leia do teclado a 2a nota e guarde-a
		nota2 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a 2a nota"));

		// 5. Some as duas notas, divida por dois, e guarde o resultado
		media = (nota1 + nota2) / 2;

		// 6. Mostre na tela o resultado do passo 5
		JOptionPane.showMessageDialog(null, media);
	}
}
