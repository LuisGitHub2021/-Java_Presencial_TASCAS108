package n1Exercici8;

@FunctionalInterface
public interface Reverse {

	String wordAgirar(String word);

	static String girarWord(String word) {

		String wordGirado = "";

		for (int i = 1; i <= word.length(); i++) {

			wordGirado += word.charAt(word.length() - i);

		}

		return wordGirado;

	}

}
