package _06_minion;

public class Minion {
String name ;
int eyes ;
String Color ;
String Master ;

	Minion(String name, int eyes, String Color, String Master ){
	
	
		
	this.name=name;
	this.eyes = eyes;
	this.Color = Color ;
	this.Master =Master;
	
	
	
}
	
	String  getName()
	{
		
		
		
		
		 
		
		
		
		 return name;
		
	}
	
	int  getEyes()
	{

		 return eyes;
		
	}
	
	String  getColor()
	{

		 return Color;
		
	}
	String  getMaster()
	{

		 return Master;
		
	}
	void  setMaster(String Master)
	{

		 this.Master= Master;
		
	}
	
	
	
}
