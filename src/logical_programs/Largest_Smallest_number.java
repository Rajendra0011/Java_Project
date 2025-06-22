package logical_programs;


import java.util.Arrays;

public class Largest_Smallest_number {

	public static void main(String[] args) {
		int numbers[] = { 3, 5, 7, 8, 9, 11 };
		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];

			} else if (numbers[i] < smallest) {

				smallest = numbers[i];
			}
		}
		System.out.println("given Arrays is :: "+Arrays.toString(numbers));
		System.out.println("Smallest number :: "+smallest);
		System.out.println("Smallest number :: "+largest);

	}

}
