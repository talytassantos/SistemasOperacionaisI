package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController op = new OperacoesController();
//		op.concatenaString();
//		op.concatenaBuffer();/
		
		String frase = "Ol� turma do terceiro semestre de ADS da FATEC ZL";
		op.divideFrase(frase);
		
	}
	
}