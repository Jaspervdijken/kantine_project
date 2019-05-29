package main;

public class Main
{
    /**
     * Start een simulatie
     */
    public static void main(String[] args)
    {
    	int dagen = 10;
    	
        if (args.length > 0)
        {
            dagen = Integer.parseInt(args[0]);
        }
        
        KantineSimulatie simulatie = new KantineSimulatie();
        simulatie.simuleer(dagen);
    }
}