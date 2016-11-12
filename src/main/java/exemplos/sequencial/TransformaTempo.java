package exemplos.sequencial;

import javax.swing.JOptionPane;

public class TransformaTempo {
	public static void main(String[] args) {
		int horas, mminutos, segundos;
		
		segundos = Integer.parseInt(
			JOptionPane.showInputDialog(null, "Digite o tempo em segundos"));
		
		segundos = 8425;
		horas = segundos / 3600;
		mminutos = segundos % 3600 / 60;
		segundos = segundos % 3600 % 60;
		
		JOptionPane.showMessageDialog(null,
			horas + ":" + mminutos + ":" + segundos);
	}
}
