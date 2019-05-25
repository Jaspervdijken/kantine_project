package main;

public class Artikel
{
	String name = "";
	double price = 0.0;
	
	public Artikel(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public Artikel()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
}