package primeiroJvaWebCurso;



import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		System.out.println("ola Mundo");
		
		String carro = JOptionPane.showInputDialog("Digite quantidade de carro ");
		String pessoa = JOptionPane.showInputDialog("Digite quantidade de  pessoa ");

		double cnumero = Double.parseDouble(carro);
		double pnumero = Double.parseDouble(pessoa);
		
		int divi = (int)(cnumero / pnumero);// divisao por inteiro 
		double resto = cnumero % pnumero;
		
		int res = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão");
		
		if (res == 0) {
			JOptionPane.showMessageDialog(null, " Divisão "+divi+" de carro  ");

		}
		res = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão");
		
		if (res == 0) {
		JOptionPane.showMessageDialog(null, "  sobrou "+resto+" carro ");
		}
	}
}
