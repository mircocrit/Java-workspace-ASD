package BagOfWords;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		BagOfWords bag = new BagOfWords();
		BagOfWords bag2 = new BagOfWords();
		BagOfWords bag3 = new BagOfWords();

		Iterator it1 = bag.bagOfWords.freqParole.iterator();// itera sulle
															// stringhe della
															// prima bow
		Iterator it2 = bag.bagOfWords.iterator(); // itera sulle occorrenze
													// della prima bow

		Iterator it3 = bag2.bagOfWords.freqParole.iterator();// itera sulle
																// stringhe
																// della seconda
																// bow
		Iterator it4 = bag2.bagOfWords.iterator(); // itera sulle occorrenze
													// della seconda bow

		Iterator it5 = bag3.bagOfWords.freqParole.iterator();// itera sulle
																// stringhe
																// della terza
																// bow
		Iterator it6 = bag3.bagOfWords.iterator(); // itera sulle occorrenze
													// della terza bow

		bag.addText("Questo � un sistema innovativo per la scoperta automatica di plagi");

		bag2.addText("Questo sistema innovativo permette la scoperta automatica di plagi");

		bag3.addText("Questo sistema non fa proprio nulla di interessante");

		System.out.println("Prima bag of words");
		while (it1.hasNext() && it2.hasNext())
			System.out.println(it1.next() + " " + it2.next());

		System.out.println("Seconda bag of words");
		while (it3.hasNext() && it4.hasNext())
			System.out.println(it3.next() + " " + it4.next());

		System.out.println("Terza bag of words");
		while (it5.hasNext() && it6.hasNext())
			System.out.println(it5.next() + " " + it6.next());

		System.out.println("Similarit� tra la prima e la seconda: "
				+ bag.similarit�(bag2));
		System.out.println("Similarit� tra la seconda e la terza: "
				+ bag2.similarit�(bag3));
		System.out.println("Similarit� tra la prima e la terza: "
				+ bag.similarit�(bag3));

	}

}
