package br.edu.univas.components;

import java.util.ArrayList;
import java.util.List;

public class MyJPanel {

	private List<VisualElement> elements = new ArrayList<>();
	
	public void add(VisualElement visualElement) {
		elements.add(visualElement);
	}
	
	public void paint() {
		for (VisualElement element : elements) {
			element.print();
		}
	}
}
