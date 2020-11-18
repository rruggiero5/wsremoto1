package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		/*
		 * Pedir pro usuario: dia, mes e ano em variaveis separadas
		 * ano=> maior que 1900 e menor que 2002
		 * mes => deve estar entre 1 e 12
		 * dia => entre 1 e 31 dependendo do mês
		 * No final pode exibir a data
		 */


		short ano = Short.parseShort(JOptionPane.showInputDialog("Entre com o ano"));
		while (ano<=1900 || ano>=2002) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Entre com o ano maior que 1900 e menor que 2002"));
		}

		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Entre com o mês"));
		while (mes<1 || mes>12) {
			ano = Byte.parseByte(JOptionPane.showInputDialog("Entre com o mês entre 1 e 12"));
		}

		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Entre com o dia"));
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			while (dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Entre com o dia entre 1 e 30"));
			}
		}

		if (mes == 2) {
			while (dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Entre com o dia entre 1 e 29"));
			}
		}

		while (dia<1 || dia>31) {
			dia = Byte.parseByte(JOptionPane.showInputDialog("Entre com o dia entre 1 e 31"));
		}

		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
	}
}
