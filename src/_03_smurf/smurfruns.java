package _03_smurf;

public class smurfruns {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	Handy.eat();
	System.out.println(Handy.getName());
	Handy.isGirlOrBoy();
	Smurf Smurfette = new Smurf("Smurfette");
	Smurf Papa_Smurf = new Smurf("Papa Smurf");
	System.out.println(Smurfette.getName()+ "has a "+ Smurfette.getHatColor()+" hat and is a "+ Smurfette.isGirlOrBoy()
	);
	
}
}
