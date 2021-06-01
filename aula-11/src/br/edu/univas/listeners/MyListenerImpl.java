package br.edu.univas.listeners;

import br.edu.univas.components.VisualElement;

public class MyListenerImpl implements MyListener {

	@Override
	public void event(VisualElement source) {
		source.clickEvent();
	}

}
