package com.redhat.ceylon.testFiles;

public class TestGenerics<K, V> {
	public void foo() {
		TestGenerics<String, Integer> t = new TestGenerics<String, Integer>();
	}
}