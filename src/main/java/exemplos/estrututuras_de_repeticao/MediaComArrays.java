package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class MediaComArrays {
	public static double calculaMedia(double[] notasDoAluno) {
		double somaNotas = 0, media;

		for (int i = 0; i < notasDoAluno.length; i++) {
			somaNotas = somaNotas + notasDoAluno[i];
		}

		media = somaNotas / notasDoAluno.length;

		return media;
	}

	public static String mostraNotas(double[] notas) {
		String r = "";

		for (int i = 0; i < notas.length; i++) {
			r = r + notas[i] + " ";
		}

		return r;
	}

	public static void main(String[] args) {
		double[] notas = new double[5];

		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(JOptionPane
					.showInputDialog("Digite a " + (i + 1) + "a nota"));
		}

		JOptionPane.showMessageDialog(null, "Média: " + calculaMedia(notas));
		System.out.println("Notas: " + mostraNotas(notas));
	}
}
