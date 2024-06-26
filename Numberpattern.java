package labassinment;

public class Numberpattern {

	public static void main(String[] args) {

		int row = 5, num = 0, space = 4;

		// outer loop to handle number of rows
		for (int i = 0; i < row; i++) {
			// inner loop to print the spaces
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			// inner loop to print the first part
			for (int k = 0; k <= i; ++k) {
				System.out.print(++num);
			}

			// inner loop to print the second part
			for (int l = i - 1; l >= 0; l--) {

				System.out.print(--num);
			}
			space--;
			// printing new line for each row
			System.out.println();
		}

	}

}
