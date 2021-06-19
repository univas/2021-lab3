package br.edu.univas.main;

public class MyGenericContainer3<K, V> {

	private K key;
	private V value;
	
	public MyGenericContainer3(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
		
}
