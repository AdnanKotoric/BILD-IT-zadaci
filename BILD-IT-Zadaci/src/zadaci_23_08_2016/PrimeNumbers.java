package zadaci_23_08_2016;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<>();
		StackOfIntegers stack = new StackOfIntegers();
		//dodajemo Prime brojeve do 120
		for (int i = 0; i < 120; i++) {
			if (isPrime(i)) {
				primes.add(i);
				stack.push(i);
			}
		}
		// ispsis u padajucemo redoslijedu
		for (int i = primes.size() - 1; i >= 0; i--) {
			System.out.print(primes.get(i).intValue() + " ");
		}
		System.out.println();
		// kreiramo novi objekat
		StackOfIntegers stack2 = new StackOfIntegers();
		// pushaamo elemente i obrce ih
		for (int i = stack.getSize(); i >= 0; i--) {
			while (!stack.empty()) {
				stack2.push(stack.pop());
			}
		}
		// i printamo u rastucem redoslijedu
		for (int i = 0; i < stack2.getSize(); i++) {
			while (!stack2.empty()) {
				System.out.print(stack2.pop() + " ");
			}
}
	}

	public static boolean isPrime(int n) {
		// metoda za provjeru prime brojeva
		int c = 0;
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				c++;
			}
		}
		// vraca true ukoliko je prime 
		if (c == 2) {
			return true;
		}
		return false;
	}

}
