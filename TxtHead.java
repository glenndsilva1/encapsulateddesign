package com.servlet;

class TxtHead {
	private final String s;

	public TxtHead(String s) {
		this.s = s;
	}

	String author() {
		return s.concat(" author");
	}

	String title() {
		return s.concat(" title");
	}
	
	public static void  main(String args[]) {
		Article a = new PgArticle();
		String head = a.head();
		String author = new TxtHead(head).author();
		String name = new TxtAuthor(author).name();
		System.out.println(name);
	}
}
