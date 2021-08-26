package view;

import javax.swing.JOptionPane;

import controller.KillController;

public class Main {
	
	public static void main(String[] args) {
		KillController killController = new KillController();
		int OPC =0;
		do {
			OPC=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Mostrar Processos Ativos\n2 - Encerrar processo\n9 - Fim"));
			switch (OPC) {
			case 1:
				killController.listaProcessos(killController.os());
				break;
			case 2:
				String processo = JOptionPane.showInputDialog("Digite o nome do processo ou PID para encerrar");
				try {
					int pid= Integer.parseInt(processo);
					killController.mataPid(killController.os(), pid);
				} catch (NumberFormatException e) {
					killController.mataNome(killController.os(), processo);
				}
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
			}
		}
		while (OPC!=9);
		
	}

}
