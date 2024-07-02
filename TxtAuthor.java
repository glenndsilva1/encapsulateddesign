package com.servlet;
// Take the whole and extract the part
public class TxtAuthor {
	private final String s;
	
	public TxtAuthor(String s) {
		this.s = s;
	}

	String name() {
		return s.concat(" name");
	}
}
