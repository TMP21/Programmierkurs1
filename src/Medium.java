import java.time.LocalDate;
import java.util.Formatter;
import java.util.Objects;

@SuppressWarnings("unused")
public abstract class Medium {

	private int id;
	private String Titel;
	private int Jahr;
	private static int counter = 0;

	public Medium(String Titel, int Jahr) {
		this.Titel = Titel;
		this.Jahr = Jahr;
		this.id = counter;
		counter++;
	}

	public abstract void druckeDaten();

	public int alter() {
		return LocalDate.now().getYear() - Jahr;
	}

	public int getID() {
		return id;
	}

	public String getTitel() {
		return Titel;
	}

	public void setTitel(String Titel) {
		this.Titel = Titel;
	}

	public int getJahr() {
		return Jahr;
	}

	public void setJahr(int Jahr) {
		this.Jahr = Jahr;
	}

	public int hashCode() {
		return Objects.hash(id, Titel, Jahr);
	}
	
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o instanceof Medium) {
			Medium m = (Medium)o;
			return this.Titel.equals(m.Titel) && this.Jahr==m.Jahr;
		}
		else {
			return false;
		}
	}
}
