package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {

		//instancia 
		RedesController redesController = new RedesController ();
				
		int OPC = 0;
		
		do {
			OPC=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Mostrar IPv4 dos adaptadores\n2 - Média de ping\n9 - Fim"));
			switch(OPC) {
			case 1: 
				redesController.ip();
				break;
			case 2:
				redesController.ping();
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida");
			}
		} while (OPC!=9);
	}
}

