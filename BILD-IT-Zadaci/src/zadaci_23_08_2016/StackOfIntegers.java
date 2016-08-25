package zadaci_23_08_2016;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	// konstruktor sa standardnim kapacitetotm
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	// konstruktor sa odredjenim kapacitetom
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// provjera je li stack prazan
	public boolean empty() {
		return size == 0;
	}

	// vraca elemenat na vrhu
	public int peek() {
		return elements[size - 1];
	}

	// pusha brojeve prema vrhu liste
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	// vraca i brise elemente na kraju stacka
	public int pop() {
		return elements[--size];
	}

	public int getSize() {
		return size;
}
}
