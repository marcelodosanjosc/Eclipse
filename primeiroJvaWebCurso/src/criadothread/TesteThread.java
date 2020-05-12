package criadothread;

import javax.swing.JOptionPane;

public class TesteThread {

	public static void main(String[] args) throws InterruptedException {
		
	Thread threadPrimeiro	= new Thread(thread1);
		threadPrimeiro.start(); 
		
		Thread threadSegundo  = new Thread(thread2);
		threadSegundo.start(); // start fica pro tras 
			
		
	 
		// para avisa que esta exercutado por tras para usurio
		JOptionPane.showMessageDialog(null, "Sistema Continua execurtando para usuario");
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// codigo da rotina exercuta em paralelo
			for (int i = 0; i < 10; i++) {
				System.out.println(" Exercutado outra:");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}// tempo 
				
			}
			// msg de fim
			System.out.println(" Fim da thread 2");
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {// aqui fica o codigo que quer executar
			// codigo da rotina exercuta em paralelo
			for (int i = 0; i < 10; i++) {
				System.out.println(" Exercutado ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}// tempo 
				
			}
			// msg de fim
			System.out.println(" Fim da thread");
			
		}
	};
}
