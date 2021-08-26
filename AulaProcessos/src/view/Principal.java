package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {

		//instancia 
		ProcessosController procController = new ProcessosController ();
		
//		String os = procController.os();	
//		System.out.println(os);

//		String process = "C:\\Windows\\write.exe";
//		procController.callProcess(process);
		
//		String process = "C:\\Windows\\regedit.exe";
//		procController.callProcess(process);
		
//		String process = "TASKLIST /FO TABLE";
//		procController.readProcess(process);
		
//		String process = "PING www.google.com.br";
//		procController.readProcess(process);
		
//		String process = "TRACERT www.uol.com.br";
//		procController.readProcess(process);
		
//		String process = "IPCONFIG";
//		procController.readProcess(process);
		
		String param = "6124";
		procController.killProcess(param);
	}

}