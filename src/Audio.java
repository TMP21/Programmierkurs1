import java.util.Objects;

public class Audio extends Medium {

	private String Interpret;
	private int Dauer;

	public Audio(String Interpret, int Dauer, String Titel, int Jahr) {
		super(Titel, Jahr);
		this.Interpret = Interpret;
		this.Dauer = Dauer;
	}

	public void druckeDaten() {
		System.out.format("Titel: %s\n Interpret: %s\n Dauer: %d\n ErscheinungsJahr: %d\n Id: %d\n", getTitel(),
				Interpret, Dauer, getJahr(), getID());
	};

	public String getInterpret() {
		return Interpret;
	}

	public void setInterpret(String Interpret) {
		this.Interpret = Interpret;
	}

	public int getDauer() {
		return Dauer;
	}

	public void setDauer(int Dauer) {
		this.Dauer = Dauer;
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), Interpret, Dauer);
	}
}
