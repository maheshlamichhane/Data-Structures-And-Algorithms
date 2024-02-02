package com.lamichhane.trie;

public class Main {

	public static void main(String[] args) {
		
		Trie trie = new Trie();
//		trie.insert("API");
//		trie.insert("APIS");
//		
//		trie.search("ZZ");
//		
		trie.insert("API");
		trie.search("API");
		trie.delete("API");
		trie.search("API");

	}

}
