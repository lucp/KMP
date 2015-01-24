package kmp;

import static org.junit.Assert.*;

import org.junit.Test;

public class KMPTest {

	@Test
	public void test() {
		String text = "ABBACABAABCDABDBDBAC";
		String pattern = "ABCDABD";
		int match = KMP.search(text, pattern);
		System.out.println(match);
	}

}
