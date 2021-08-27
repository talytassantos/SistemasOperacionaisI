package controller;

//extends Thread
//Parametros por construtor
//metodo run

public class ThreadId extends Thread {

	private int idThread;
	
	public ThreadId (int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		//Só executa o que está aqui dentro		
		System.out.println(idThread);
	}
	
}
