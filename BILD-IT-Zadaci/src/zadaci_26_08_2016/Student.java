package zadaci_26_08_2016;

public class Student extends Person {

	private final String status;

	// konstruktor
	public Student(String status) {
		this.status = status;
	}

	// geter
	public String getStatus() {
		return status;
	}

	// overajdan ispis
	@Override
	public String toString() {
		return "Student [Person [name=" + getName() + ", adress=" + getAdress()
				+ ", phone=" + getPhone() + ", mail=" + getMail()
				+ " , status=" + status + "]";
	}

}