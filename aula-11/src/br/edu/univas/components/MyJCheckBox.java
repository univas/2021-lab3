package br.edu.univas.components;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.listeners.MyListener;

public class MyJCheckBox implements VisualElement {

private List<MyListener> listeners = new ArrayList<>();
	
	@Override
	public void addListener(MyListener listener) {
		listeners.add(listener);
	}

	@Override
	public void click() {
		for (MyListener listener : listeners) {
			listener.event(this);
		}
	}

	@Override
	public void print() {
		System.out.println("MYJCHECKBOX");
	}

	@Override
	public void clickEvent() {
		System.out.println("MyJCheckBox Click");
	}

}
