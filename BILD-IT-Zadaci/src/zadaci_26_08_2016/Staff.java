package zadaci_26_08_2016;

import java.util.Date;

public class Staff extends Employee {
	private String title;

	// konstruktor
	public Staff() {
	}

	public Staff(String office, double salary, Date dateHired) {
		super(office, salary, dateHired);

	}

	// geteri i seteri
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + "]";
	}

}