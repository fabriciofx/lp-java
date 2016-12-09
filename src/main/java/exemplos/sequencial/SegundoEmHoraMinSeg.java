package exemplos.sequencial;

import javax.swing.JOptionPane;

public class SegundoEmHoraMinSeg {
	public static void main(String[] args) {
		int tempo, horas, minutos, segundos;
		
		tempo = Integer.parseInt(
			JOptionPane.showInputDialog(null, "Digite o tempo em segundos"));
		
		horas = tempo / 3600;
		minutos = tempo % 3600 / 60;
		segundos = tempo % 3600 % 60;
		
		JOptionPane.showMessageDialog(null,
			horas + ":" + minutos + ":" + segundos);
	}
}
