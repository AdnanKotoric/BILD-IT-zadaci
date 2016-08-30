package zadaci_26_08_2016;

import java.util.Date;

public class Person {

	private String name;
	private String adress;
	private String phone;
	private String mail;

	// konstruktor
	public Person() {

	}

	// geteri i seteri
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", adress=" + adress + ", phone="
				+ phone + ", mail=" + mail + "]";
	}

	public static void main(String[] args) {
		// kreiramo objekat
		Student student = new Student("Junior");
		Employee employee = new Employee();
		Faculty faculty = new Faculty();
		Staff staff = new Staff();
		// setujemo informacije studenta pomocu metoda klase
		student.setName("Adnan Adnan");
		student.setAdress("Tesanj");
		student.setMail("bildIT@mail.com");
		student.setPhone("666-666-666");
		// setujemo informacije radnika metodama klase employee
		employee.setName("Kotoric Kotoric");
		employee.setAdress("Tesanj");
		employee.setMail("radnamasina@mail.com");
		employee.setPhone("+38762-666-666");
		employee.setOffice("Informatika");
		employee.setDateHired(new Date());
		employee.setSalary(800);
		// info fakulteta
		faculty.setOfficeH(6);
		faculty.setRank("Profesor");
		// staff data
		staff.setTitle("Zaposlen");
		// spis u stringu svih podataka
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
