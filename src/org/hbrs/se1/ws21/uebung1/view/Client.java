package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.Factory;
import org.hbrs.se1.ws21.uebung1.control.Translator;

public class Client {

	private Translator translator;

	/*
	 * Methode zur Ausgabe einer Zah auf der Console
	 */

	public void display(int aNumber){

		// In dieser Methode soll die Methode translateNumber
		// mit dem übergebenen Wert der Variable aNumber
		// aufgerufen werden.
		//
		// Strenge Implementierung gegen das Interface Translator gewuenscht!

		Translator translator = Factory.createGermanTranslator(); // neuer GermanTranslator
		String erg = translator.translateNumber(aNumber);		// erg = Ergebnis
		System.out.println("Das Ergebnis an dieser Stelle lautet: " + erg);

	}

}




