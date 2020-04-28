package _07_tea_party;


	import static org.junit.Assert.assertEquals;
	import org.junit.Test;

	public class behindthescenestest  {
	 /**
	  * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	  * George Orwell is a man, so say “Hello Mr. Orwell”. 
	  * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	  **/

	 @Test
	 public void test() {
	     behindthescenestest behindthescenestest = new behindthescenestest();
	      String greeting = thegreatestteaparty.welcome(null, false, false);
	      assertEquals("Hello Ms. Austen", thegreatestteaparty.welcome("Austen", true, false));
	      assertEquals("Hello Mr. Orwell", thegreatestteaparty.welcome("Orwell", false, false));
	      assertEquals("Hello Sir Isaac Newton", thegreatestteaparty.welcome("Isaac Newton", false, true));
	 }
	}
	    

