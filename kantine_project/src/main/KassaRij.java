package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class KassaRij {
	
	private ArrayList<Dienblad> queue;

    /**
     * Constructor
     */
    public KassaRij() {
        this.queue = new ArrayList<Dienblad>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        this.queue.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        if(erIsEenRij())
        {
        	return this.queue.remove(0);
        }
        return null;
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
    	if(this.queue.size() > 0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}