package brusnitsyna.seven.two;

import java.io.*;

public class SeventhTask {
	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("test.txt");		
		String[] keywords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch",
				"char", "class", "const", "continue", "default", "do", "double", "else", "enum",
				"extends", "final", "finally", "float", "for", "goto", "if", "implements",
				"import", "instanceof", "int", "interface", "long", "native", "new", "package",
				"private", "protected", "public", "return", "short", "static", "strictfp",
				"super", "switch", "synchronized", "this", "throw", "throws", "transient",
				"try", "void", "volatile", "while"
			};
		int[] numberOfKeywords = new int[50];
		
		int ch = fin.read();
		while (ch != -1) {
			if (!Character.isLetter((char)ch)) {
				ch = fin.read();
				continue;
			}
			String currentWord = "";
			while (Character.isLetter((char)ch)) {
				currentWord += (char)ch;
				ch = fin.read();
			}
			for (int i = 0; i < 50; i++) {
				if (currentWord.equals(keywords[i])) {
					numberOfKeywords[i]++;
					break;
				}
			}
			ch = fin.read();
		}
		fin.close();
		for (int i = 0; i < 50; i++) {
			if (numberOfKeywords[i] != 0) {
				System.out.println(keywords[i] + " - " + numberOfKeywords[i]);
			}
		}
	}
}
