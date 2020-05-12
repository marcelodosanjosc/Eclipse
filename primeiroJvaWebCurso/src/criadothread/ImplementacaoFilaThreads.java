package criadothread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThreads extends Thread{
	private static ConcurrentLinkedQueue<ObjetoFilaThreads> pilha_fila =
			new ConcurrentLinkedQueue<ObjetoFilaThreads>();
	
		public static void add(ObjetoFilaThreads objetoFilaThreads) {
			pilha_fila.add(objetoFilaThreads);
		}

		@Override
		public void run() {
			System.out.println(" Fila rodando");
			
			while (true) {
				
			synchronized (pilha_fila) {// bloquear o acesso a esta lista por outro processo
				Iterator iterator = pilha_fila.iterator();
				while (iterator.hasNext()) { // Enquando conter dados na lista irá processar
					ObjetoFilaThreads processar = (ObjetoFilaThreads) iterator.next();
					// processsar 10 mil nota fiscais
					// gerar um lista enorme de pdf
					System.out.println("-------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					System.out.println("-------------------------");
					
					iterator.remove();
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			
			}
				
			
			
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {// para limpa a memoria
					
					e.printStackTrace();
				}
		}
	}
}
