package org.hbrs.se1.ws21.uebung1.control;

/**
 *  Klasse für Erzeugung der Objekte
 */
public class Factory {

    public static Translator createGermanTranslator() {
        GermanTranslator translator = new GermanTranslator();
        translator.setDate("06.10.2021");
        return translator;
    }

}
