package com.servlet;

public class TxtAuthor {
	private final String s;
	
	public TxtAuthor(String s) {
		this.s = s;
	}

	String name() {
		return s.concat(" name");
	}
}
