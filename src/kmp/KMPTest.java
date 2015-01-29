package kmp;

import static org.junit.Assert.*;

import org.junit.Test;

public class KMPTest {

	@Test
	public void test() {
		String text = "ABBACABAABCDABDBDBAC";
		String pattern = "ABCDABD";
		int match = KMP.search(text, pattern);
		System.out.println(text);
		for (int i = 0; i < match; i++) {
			System.out.print(" ");
		}
		System.out.println(pattern);
		System.out.println("Position: " + match);
		
		text = "TO BE OR NOT TO BE";
		pattern = "NOT";
		match = KMP.search(text, pattern);
		System.out.println(text);
		for (int i = 0; i < match; i++) {
			System.out.print(" ");
		}
		System.out.println(pattern);
		System.out.println("Position: " + match);
		
		text = "WYSZUKAJ WZORZEC";
		pattern = "WZOR";
		match = KMP.search(text, pattern);
		System.out.println(text);
		for (int i = 0; i < match; i++) {
			System.out.print(" ");
		}
		System.out.println(pattern);
		System.out.println("Position: " + match);
		
		text = "WYSZUKAJ WZORZEC";
		pattern = "WZOC";
		match = KMP.search(text, pattern);
		System.out.println(text);
		for (int i = 0; i < match; i++) {
			System.out.print(" ");
		}
		System.out.println(pattern);
		System.out.println("Position: " + match);
	}

}
