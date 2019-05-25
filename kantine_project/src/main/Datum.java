package main;

public class Datum {

	private int dag;
	private int maand;
	private int jaar;
	
	public Datum()
	{
		this.dag = 0;
		this.maand = 0;
		this.jaar = 0;
	}
	
	public Datum(int dag, int maand, int jaar)
	{
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		bestaatDatum(dag,maand,jaar);
	}
	
	//Methode om te checken of de datum valide is
	public boolean bestaatDatum(int dag, int maand, int jaar)
	{
		//Checken of de datum binnen de limiet valt
		if ((dag >= 1) && (maand > 0 && maand <= 12) && (jaar >= 1900 && jaar <= 2100))
		{
			//De maanden met max 31 dagen apart nemen
			if(maand == 1 || maand == 3 || maand == 5 || maand == 7 || maand == 8 || maand == 10 || maand == 12)
			{
				//Heeft de maand max 31 dagen? -> datum bestaat
				if(dag <= 31)
				{
					System.out.println("true");
					return true;
				}
			}
			//Alle maanden behalve februari, max 30 dagen? -> datum bestaat
			else if (maand != 2) {
				if (dag <= 30) {
					System.out.println("true");
					return true;
				}
			}
			//Februari over
			else {
				//Checken op schrikkeljaar, wanneer schrikkeljaar max 29 dagen, zo niet max 28 dagen
				if ((maand == 2 && jaar%4 == 0 && dag < 30) || (maand == 2 && jaar%4 != 0 && dag < 29)) {
					System.out.println("true");
					return true;
				} 
			}
		}
		//Geen enkele conditie is juist?
		System.out.println("false");
		return false;
	}
	
	
	/**
	 * Getter voor Sting weergave van datum
	 * @return Geboortedatum
	 */
	public String getDatumAsString()
	{
		// TODO
		String str = dag + "-" + maand + "-" + jaar;
		return str;
	}
	
	public int getDag()
	{
		return dag;
	}
	
	public int getMaand()
	{
		return maand;
	}
	
	public int getJaar()
	{
		return jaar;
	}
}
