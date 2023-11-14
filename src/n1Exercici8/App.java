package n1Exercici8;

public class App {

	public static void main(String[] args) {

		Reverse reverseWord = Reverse::girarWord;
		System.out.println(reverseWord.wordAgirar("Luis"));

	}
}