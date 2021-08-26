/* Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor 
 * de 1000 posições e gere o tempo gasto para percorrer o vetor. 
 * Repetir para 10000 e 100000 posições. 
 * */

package controller;

public class OperacoesController {
	
	public OperacoesController () {
		super();
	}
	
		//Ler um vetor de 1000 posições, com valores de 1 a 10, iterar cada vetor somando o conteúdo dos vetores.
		public void  primeiraLeitura() {
			
			long [] vetor = new long [1000];
			long soma = 0;
			
			double tempoInicial = System.nanoTime();
			
			for (int i = 0 ; i < 10 ; i++) {
				vetor [i] = i+1;
				soma = soma + vetor[i];				 
//	     		System.out.println(vetor[i]);
			}
			
			for (int i = 10 ; i < 1000; i++) {
				vetor[i] = soma;
				soma = soma + vetor[i];
//	     		System.out.println(vetor[i]);
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			//tempoTotal nS = 10^-9 s 
			tempoTotal = tempoTotal / Math.pow(10, 9);
			
			System.out.println("Tempo v[1000] ==> " +tempoTotal+ " s.");		
	
		}
		
		//Ler um vetor de 10000 posições, com valores de 1 a 10, iterar cada vetor somando o conteúdo dos vetores.
		public void  segundaLeitura() {
			
			long [] vetor = new long [10000];
			long soma = 0;
			
			double tempoInicial = System.nanoTime();
			
			for (int i = 0 ; i < 10 ; i++) {
				vetor [i] = i+1;
				soma = soma + vetor[i];				 
//	     		System.out.println(vetor[i]);
			}
			
			for (int i = 10 ; i < 10000; i++) {
				vetor[i] = soma;
				soma = soma + vetor[i];
//	     		System.out.println(vetor[i]);
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			//tempoTotal nS = 10^-9 s 
			tempoTotal = tempoTotal / Math.pow(10, 9);
			
			System.out.println("Tempo v [10000]==> " +tempoTotal+" s.");		
	
		}		
		
		//Ler um vetor de 100000 posições, com valores de 1 a 10, iterar cada vetor somando o conteúdo dos vetores.
		public void  terceiraLeitura() {
			
			long [] vetor = new long [100000];
			long soma = 0;
			
			double tempoInicial = System.nanoTime();
			
			for (int i = 0 ; i < 10 ; i++) {
				vetor [i] = i+1;
				soma = soma + vetor[i];				 
//	     		System.out.println(vetor[i]);
			}
			
			for (int i = 10 ; i < 100000; i++) {
				vetor[i] = soma;
				soma = soma + vetor[i];
//	     		System.out.println(vetor[i]);
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			//tempoTotal nS = 10^-9 s 
			tempoTotal = tempoTotal / Math.pow(10, 9);
			
			System.out.println("Tempo v [100000]==> " +tempoTotal+" s.");		
	
		}

}