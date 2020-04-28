package _07_tea_party;

public class thegreatestteaparty {
	String name;
	boolean isWoman;
	boolean isKnighted;

	public static String welcome(String name, boolean isWoman, boolean isKnighted) {
		String title= "";
		if (isKnighted && !isWoman) {

			title = "Sir ";
		} else if (!isWoman && !isKnighted) {
			title = "Mr. ";
		}

		if (isKnighted && isWoman) {
			title = "Lady ";
		} else if (!isKnighted && isWoman) {
			title = "Ms. ";
		}

		String welcome;
		System.out.println(welcome = "Hello " + title + name);
		return welcome;
	}

}
