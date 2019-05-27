package main;

public class Persoon
{
	private int bsn;
    private String voornaam;
    private String achternaam;
    private int gb_dag;
    private int gb_maand;
    private int gb_jaar;
    private char geslacht;
    
    public Persoon(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht)
    {
    	setBSN(bsn);
    	setVoornaam(voornaam);
    	setAchternaam(achternaam);
    	setGeboorteDatum(dag, maand, jaar);
    	setGeslacht(geslacht);
    }
    
    public Persoon()
    {
    	this(0, "", "", 0, 0, 0, 'o');
    }
    
    public void setBSN(int bsn)
    {
    	this.bsn = bsn;
    }
    
    public void setVoornaam(String voornaam)
    {
    	this.voornaam = voornaam;
    }
    
    public void setAchternaam(String achternaam)
    {
    	this.achternaam = achternaam;
    }
    
    public void setGeboorteDatum(int dag, int maand, int jaar)
    {
    	this.gb_dag = dag;
    	this.gb_maand = maand;
    	this.gb_jaar = jaar;
    }
    
    public void setGeslacht(char geslacht)
    {
    	if((geslacht != 'm') && (geslacht != 'v'))
    	{
    		this.geslacht = 'o';
    		return;
    	}
    	this.geslacht = geslacht;
    }
    
    public int getBSN()
    {
    	return bsn;
    }
    
    public String getVoornaam()
    {
    	return voornaam;
    }
    
    public String getAchternaam()
    {
    	return achternaam;
    }
    
    public String getGeboorteDatum()
    {
    	Datum datum = new Datum(gb_dag, gb_maand, gb_jaar);
    	return datum.getDatumAsString();
    }
    
    public String getGeslacht()
    {
    	if(geslacht == 'm')
    	{
    		return "Man";
    	}
    	if(geslacht == 'v')
    	{
    		return "Vrouw";
    	}
    	return "Onbekend";
    }
    
    public String toString()
    {
    	return Integer.toString(bsn) + ", " + voornaam + ", " + achternaam + ", " + getGeboorteDatum() + ", " + getGeslacht();
    }
    
    public void setDienblad(Dienblad dienblad)
    {
    	this.dienblad = dienblad;
    }
}