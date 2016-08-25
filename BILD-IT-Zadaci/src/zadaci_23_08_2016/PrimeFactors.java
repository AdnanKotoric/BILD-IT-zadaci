package zadaci_23_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int factor = 0;
		try {

			System.out.println("Enter the number");
			int num = input.nextInt();
			// petlja za pronalazak faktora
			StackOfIntegers stack = new StackOfIntegers();
			for (int i = 2; i <= num; i++) {
				// dok je broj djeljiv sa i, petlja radi, spremamo i u stack
				while (num % i == 0) {
					factor = i;
					// stores the number
					list.add(factor);
					stack.push(factor);
					num = num / i;

				}
			}
			// ispis faktora u padajucem redoslijedu
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.print(list.get(i).intValue() + " ");
			}
			System.out.println();
			// kreiramo novi objekat
			StackOfIntegers stack2 = new StackOfIntegers();
			// pomjera elemente i obrce njihov redoslijed
			for (int i = stack.getSize(); i >= 0; i--) {
				while (!stack.empty()) {
					stack2.push(stack.pop());
				}
			}
			// ispis elemenata
			for (int i = 0; i < stack2.getSize(); i++) {
				while (!stack2.empty()) {
					System.out.print(stack2.pop() + " ");
				}
			}

			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
			main(args);
		}

	}

}
