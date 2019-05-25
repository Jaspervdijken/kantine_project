package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
    private ArrayList<Artikel> artikelen;

    /**
     * Constructor
     */
    public Dienblad() {
    	//
        artikelen = new ArrayList();
    }
    
    public Dienblad(Persoon persoon)
    {
    	Persoon eigenaar = new Persoon();
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
    	//
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {
        // method body omitted
    	return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        // method body omitted
    	double totaalPrijs = 0;
    	return totaalPrijs;
    }
}
