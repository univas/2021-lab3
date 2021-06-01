package br.edu.univas.main;

import br.edu.univas.components.MyJButton;
import br.edu.univas.components.MyJCheckBox;
import br.edu.univas.components.MyJPanel;
import br.edu.univas.components.MyJTable;
import br.edu.univas.listeners.MyListener;
import br.edu.univas.listeners.MyListenerImpl;

public class StartApp {

	public static void main(String[] args) {
		MyListener listener = new MyListenerImpl();
		MyListener listenerTwo = new MyListenerImpl();
		
		MyJButton jButton = new MyJButton();
		jButton.addListener(listener);
		jButton.addListener(listenerTwo);
		
		MyJTable jTable = new MyJTable();
		jTable.addListener(listener);
		
		MyJCheckBox jCheckBox = new MyJCheckBox();
		jCheckBox.addListener(listener);
		
		MyJPanel jPanel = new MyJPanel();
		jPanel.add(jButton);
		jPanel.add(jTable);
		jPanel.add(jCheckBox);
		jPanel.paint();
		
		//simulando o click nos botões
		System.out.println("\n\n\n");
		jButton.click();
		jTable.click();
		jCheckBox.click();
	}
	
}
