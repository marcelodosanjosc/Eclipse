package testeclassedeobjetonovos;

import criadoclassealunoetc.Disciplina;

public class MatrizMain {

	public static void main(String[] args) {
	 int notas[][] = new int[2][3];
	 notas[0][0] = 80;
	 notas[0][1] = 60;
	 notas[0][2] = 70;
	 
	 notas[1][0] = 85;
	 notas[1][1] = 65;
	 notas[1][2] = 75;
	 System.out.println("      Coluna 1              Coluna 2              Coluna 3 ");
	  for (int x = 0; x <notas.length;x++) {
		  System.out.println("\n Linha "+(x +1)+"");
		  for( int y = 0; y < notas[x].length;y++) {
			  System.out.print("      Nota["+ x +"]["+ y + "]: " +notas[x][y]+"");
		  }
	  }

	}

}
