package zadaci_26_08_2016;
import java.util.Date;

public class Faculty extends Employee {
	private double officeH;
	private String rank;

	// konstruktor
	public Faculty() {

	}
	public Faculty(String office, double salary, Date dateHired, double officeH, String rank) {
		super(office, salary, dateHired);
		this.officeH = officeH;
		this.rank = rank;
	}
	// geteri i seteri
	public double getOfficeH() {
		return officeH;
	}
	public void setOfficeH(double officeH) {
		this.officeH = officeH;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Faculty [officeH=" + officeH + ", rank=" + rank + "]";
	}

}
