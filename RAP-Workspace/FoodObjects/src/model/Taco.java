package model;

public class Taco {
	private String flavor; 
	private String tortilla ;
	private double cost; 

	//Constructors 
	public Taco() {
		this("veggie", "flour",3.00);
		System.out.println("Back in no args constructor");
	}
	
	public Taco(String f, String t, double c) {
	
		flavor = f; 
		tortilla = t;
		cost = c; 
	}
	
	//Getters and setters 
	//getter for flavor
	public String getFlavor() {
		return flavor; 
	}
	
	public void setFlavor(String f) {
		flavor = f; 
	}
	
	public String getTortilla() {
		return tortilla;
	}

	public void setTortilla(String tortilla) {
		this.tortilla = tortilla;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public static void main(String[] args) {
		Taco bell; 
		//initialized our bell reference variable
		//by instantiating our Taco class
		//to instantiate a class you create an object from that class. 
		bell = new Taco("beef", "flour", 1.00); 
		
		bell.setFlavor("veggies");
		bell.setCost(2.00);
		
		System.out.println("Bell: flavor="+bell.getFlavor()
				+" tortilla="+bell.tortilla+" cost ="+bell.cost);
		
		Taco a = new Taco();
		
		
		Double b = 2.0;
		Float anotherVariable = 9.0f; 
	}
}
