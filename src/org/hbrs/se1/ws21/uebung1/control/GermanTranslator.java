package org.hbrs.se1.ws21.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2021"; // Default-Wert
	/**
	 * String Array zur Beschreibung der Zahlen
	 */
	private String[] zahlen = {"eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun","zehn"};

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */

	public String translateNumber( int number ) {

		String res = ""; // res = result vom String

		try {

			res = zahlen[number - 1]; // -1 wegen Array Index 0

			// Exception für alle Fälle number < 1 oder > 10
		} catch (ArrayIndexOutOfBoundsException e) {
			res = "Keine Übersetzung der Zahl " + number + " möglich!";
		}
			return res;
		}


		
	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Okt/2021))
	 * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
