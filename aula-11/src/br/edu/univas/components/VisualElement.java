package br.edu.univas.components;

import br.edu.univas.listeners.MyListener;

public interface VisualElement {
	
	void addListener(MyListener listener);
	
	void click();
	
	void print();
	
	void clickEvent();
}
