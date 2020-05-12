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
	
	
	private JLabel descricaoHora = new JLabel(" Nome ");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel(" Email ");
	private JTextField mostraTempo2 = new JTextField();
	
	
	private JButton jtButton = new JButton("Add lista");
	private JButton jtButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThreads fila = new ImplementacaoFilaThreads();
	
	
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
		jPanel1.add(mostraTempo, gridBagConstraints);
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel1.add(descricaoHora2, gridBagConstraints);
		
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel1.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jtButton.setPreferredSize(new Dimension(100, 25));
		gridBagConstraints.gridy++;
		jPanel1.add(jtButton, gridBagConstraints);
		
		
		jtButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel1.add(jtButton2, gridBagConstraints);
					
			jtButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							if (fila == null) {
								fila = new ImplementacaoFilaThreads();
								fila.start();
							}
							for (int qt = 0; qt <50;qt++) {
							ObjetoFilaThreads filaThreads = new ObjetoFilaThreads();
							filaThreads.setNome(mostraTempo.getText());
							filaThreads.setEmail(mostraTempo2.getText() + " - "+qt);
						
							
							fila.add(filaThreads);
							}
						}
					});
					
			jtButton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					  
					   fila.stop();
					   fila = null;
					   
				}
			});
		
			
			
		fila.start();
		add(jPanel1, BorderLayout.WEST);
		setVisible(true); // torna a tela visivel para usuario sera o ultimo comando
	}
	
	
	
}
