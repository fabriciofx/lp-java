package exemplos.jogos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Imprensadinho {
	public static void main(String[] args) {
		int numero, secreto, minimo, maximo;

		// Cria um número aleatório entre 2 e 99
		secreto = new Random().nextInt(98) + 2;
		
		// Faça o intervalo ser [1, 100]
		minimo = 1;
		maximo = 100;

		// Repita o procedimento tantas vezes quanto necessário, até que o
		// jogo acabe
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite um número entre " + minimo + " e " + maximo));

			// Se o número informado for igual ao secreto, informe que o jogador
			// perdeu a partida e saia do jogo
			if (numero == secreto) {
				JOptionPane.showMessageDialog(null,
					"Você perdeu!\nO número secreto era: " + secreto);
				break;
			}
			
			// Se o número secreto estiver entre o mínimo e o número informado,
			// faça o novo intervalo ser [minimo, numero informado]
			if (minimo < secreto && numero > secreto) {
				maximo = numero;
			}
			
			// Se o número secreto estiver entre o número informado e o máximo,
			// faça o novo intervalo ser [numero informado, maximo]
			if (numero < secreto && secreto < maximo) {
				minimo = numero;
			}
			
			// Se o número informado estiver "imprensado", informe que o jogador
			// ganhou o jogo e saia do programa
			if (minimo + 1 == secreto && maximo - 1 == secreto) {
				JOptionPane.showMessageDialog(null,
					"Parabéns! Você ganhou!\nO número secreto era: " + secreto);
				break;
			}
		} while (true);
	}
}
