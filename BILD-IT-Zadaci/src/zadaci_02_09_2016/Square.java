package zadaci_02_09_2016;

public class Square extends GeometricObject implements Colorable {
	int s = 0;

	public Square(int s) {
		this.s = s;
	}
//racuna povrsinu
	double getArea() {
		return (s * s);
	}

	@Override
	//overajdamo metodu
	public void howToColor() {
		if (isFilled()) {
			System.out.println("Color all four sides");
		} else {
			System.out.println("No color");
		}
	}

}