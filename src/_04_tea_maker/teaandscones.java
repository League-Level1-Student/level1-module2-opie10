package _04_tea_maker;

import javax.swing.JOptionPane;

public class teaandscones {
public static void main(String[] args) {
	String t = JOptionPane.showInputDialog("What flavor Tea?");
	TeaBag hi = new TeaBag(t);
	Kettle hoi = new Kettle ();
	hoi.boil();
	
	Cup hooi =new Cup();
	hooi.makeTea(hi,hoi.getWater() );
}
}
