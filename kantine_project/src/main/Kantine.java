package main;

public class Kantine
{

    private Kassa kassa;
    private KassaRij kassarij;

    /**
     * Constructor
     */
    public Kantine()
    {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad gemaakt
     * en aan elkaar gekoppeld. Maak twee Artikelen aan
     * en plaats deze op het dienblad. Tenslotte sluit de
     * Persoon zich aan bij de rij voor de kassa.
     */
    public void loopPakSluitAan()
    {
    	Persoon persoon = new Persoon(123456789, "Niek", "Tillema", 27, 11, 2001, 'm');
    	Artikel art1 = new Artikel("Chocomel", 1.5);
    	Artikel art2 = new Artikel("Broodje Kaas", 2.5);
    	Dienblad dienblad1 = new Dienblad();
    	dienblad1.voegToe(art1);
    	dienblad1.voegToe(art2);
    	persoon.setDienblad(dienblad1);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa()
    {
        while(kassarij.erIsEenRij())
        {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
    }

    /**
     * Deze methode telt het geld uit de kassa
     *
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelheidGeldInKassa()
    {
       return kassa.hoeveelheidGeldInKassa();
    }

    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     *
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen()
    {
        return kassa.aantalArtikelen();
    }

    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen en "leegt" de inhoud van de kassa.
     */
    public void resetKassa()
    {
        kassa.resetKassa();
    }
}