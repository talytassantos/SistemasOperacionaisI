package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {

		OperacoesController op = new OperacoesController();

		op.primeiraLeitura();
		op.segundaLeitura();
		op.terceiraLeitura();

	}

}