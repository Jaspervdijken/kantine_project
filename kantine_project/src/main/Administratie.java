package main;

public class Administratie
{

    /**
     * Deze methode berekent van de int array aantal de gemiddelde waarde
     *
     * @param aantal
     * @return het gemiddelde
     */
    public double berekenGemiddeldAantal(int[] aantal)
    {
    	double som = 0;
    	for(int getal : aantal)
    	{
    		som = som + getal;
    	}
    	double aantalGetallen = aantal.length;
    	
    	return som/aantalGetallen;
    }

    /**
     * Deze methode berekent van de double array omzet de gemiddelde waarde
     *
     * @param omzet
     * @return het gemiddelde
     */
    public double berekenGemiddeldeOmzet(double[] omzet)
    {
        // method body omitted
    	return 1.0;
    }

    /**
     * Methode om dagomzet uit te rekenen
     *
     * @param omzet
     * @return array (7 elementen) met dagomzetten
     */

    public static double[] berekenDagOmzet(double[] omzet)
    {
        double[] temp = new double[7];
        for(int i = 0; i < 7; i++) {

            int j = 0;
            while( i < j ) {
                temp[i] += omzet[i + 7 * j];

                // omitted

            }
        }
        return temp;
    }
}