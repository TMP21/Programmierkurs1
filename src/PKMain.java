
public class PKMain {

	public static void main(String[] args) {

		Audio a = new Audio("Stereophonics", 229, "It Means Nothing", 2007);
		Bild b = new Bild("Dortmund", "Gebaeude FB Informatik", 2009);
		Audio ab = new Audio("Stereophonics", 229, "It Means Nothing", 2007);
		Audio ac = new Audio("Stereophonics", 229, "It Means Nothing", 2006);
		System.out.println(a.equals(ab));
		System.out.println(a.equals(ac));

	}

}
