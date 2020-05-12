package criadothread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	
	private JPanel jPanel1 = new JPanel(new GridBagLayout()); //painel de componetes 
	
	
	private JLabel descricaoHora = new JLabel(" Time thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel(" Time thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	
	private JButton jtButton = new JButton(" Start ");
	private JButton jtButton2 = new JButton(" Stop ");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while (true) { //fica sempre rodando
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
			
			}
			
		}
	};
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while (true) { //fica sempre rodando
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ").
						format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
			
			}
			
		}
	};
	
	private Thread threadTime;
	private Thread threadTime2;
	
	
	public TelaTimeThread() { // exercuta o que tiver dentro da abertura
		setTitle("Minha tela de time com thread ");
		setSize(new Dimension(250,250));
		setLocationRelativeTo(null);
		setResizable(false);
		// primeira parte concluida
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel1.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo.setEditable(false);
		jPanel1.add(mostraTempo, gridBagConstraints);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel1.add(descricaoHora2, gridBagConstraints);
		
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
		jPanel1.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jtButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel1.add(jtButton, gridBagConstraints);
		
		
		jtButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel1.add(jtButton2, gridBagConstraints);
					
			jtButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							threadTime = new Thread(thread1);
							threadTime.start();
							
							threadTime2 = new Thread(thread2);
							threadTime2.start();
							
							jtButton.setEnabled(false);
							jtButton2.setEnabled(true);
						}
					});
					
			jtButton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					   threadTime.stop();
					   threadTime2.stop();
					   
					   
					    jtButton.setEnabled(true);
						jtButton2.setEnabled(false);
				}
			});
		
			
		jtButton2.setEnabled(false);	
		
		add(jPanel1, BorderLayout.WEST);
		setVisible(true); // torna a tela visivel para usuario sera o ultimo comando
	}
	
	
	
}
