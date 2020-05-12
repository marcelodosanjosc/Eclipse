package testeclassedeobjetonovos;

import java.util.Arrays;
import java.util.List;

import javax.sound.midi.Soundbank;

public class SplitArray {

	public static void main(String[] args) {
		
		//para arquivos etc
		String texto = "Marcelo,Java,80,89,65,45";
		String[] valoreArray = texto.split(",");
		
		System.out.println("Nome: "+valoreArray[0]);
		System.out.println("Nome do curso: "+valoreArray[1]);
		System.out.println("Nota 1: "+valoreArray[2]);
		System.out.println("Nota 2: "+valoreArray[3]);
		System.out.println("Nota 3: "+valoreArray[4]);
		System.out.println("Nota 4: "+valoreArray[5]);
	System.out.println(" ------ converte Array para Lista -----");
	   // convertedo um Array em uma lista
		List<String> list = Arrays.asList(valoreArray);
		for (String valoreString : list) {
			System.out.println(valoreString);
		}
		System.out.println(" ------ converte Lista para Array -----");	
		// converte uma lista parra Array
		String[] conversaoArray = list.toArray(new String[6]);
		for (int i = 0; i < conversaoArray.length; i++) {
			System.out.println(conversaoArray[i]);
		}
		
		
	}

}
