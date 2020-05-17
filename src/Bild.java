import java.util.Objects;

public class Bild extends Medium {

	private String Ort;

	public Bild(String Ort, String Titel, int Jahr) {
		super(Titel, Jahr);
		this.Ort = Ort;
	}

	public String getOrt(Bild b) {
		return b.Ort;
	}

	public void setOrt(Bild b, String Ort) {
		b.Ort = Ort;
	}

	public void druckeDaten() {
		System.out.format("Titel: %s\n Ort: %s\n ErscheinungsJahr: %d\n Id: %d\n", getTitel(), Ort, getJahr(), getID());
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), Ort);
	}

}
