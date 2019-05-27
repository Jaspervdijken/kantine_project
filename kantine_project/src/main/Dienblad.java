package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad
{
    private Stack<Artikel> artikelen;

    /**
     * Constructor
     */
    public Dienblad()
    {
        artikelen = new Stack();
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
    public void voegToe(Artikel artikel)
    {
    	//
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen()
    {
    	return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs()
    {
    	double totaalPrijs = 0;
    	return totaalPrijs;
    }
}
