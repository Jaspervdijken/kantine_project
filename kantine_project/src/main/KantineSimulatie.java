package main;

public class KantineSimulatie
{
    private static Kantine kantine;

    public static final int DAGEN = 7;

    /**
     * Constructor
     */
    public KantineSimulatie()
    {
        kantine = new Kantine();
    }

    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     *
     * @param dagen
     */
    public static void simuleer(int dagen)
    {
    	// herhaal voor elke dag
        for(int i = 0; i <= dagen; i++)
        {
            // per dag nu even vast 10 + i personen naar binnen
            // laten gaan, wordt volgende week veranderd...

            // for lus voor personen
            for(int j = 0; j < 10 + i; j++)
            {
            	//week 2 opdr 5d, nog niet correct
                kantine.loopPakSluitAan(null, null);
            }

            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            // toon dagtotalen (artikelen en geld in kassa)
            System.out.println("Dag " + i + ": " + kantine.aantalArtikelen() + " artikelen verkocht voor " + kantine.hoeveelheidGeldInKassa() + "euro.");
            // reset de kassa voor de volgende dag
            kantine.resetKassa();
        }
    }

    /**
     * Start een simulatie
     */
    public static void main(String[] args)
    {
        int dagen;

        if (args.length == 0)
        {
            dagen = DAGEN;
        }
        else
        {
            dagen = Integer.parseInt(args[0]);
        }

        simuleer(dagen);
    }
}