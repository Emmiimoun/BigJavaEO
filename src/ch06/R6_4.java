package ch06;

public class R6_4 {

	public static void main(String[] args) {
		int i = 0;
		while (i * i < 100) {
			System.out.print(i * i + " ");
			i++;
		}

		System.out.println();

		i = 1;
		while (i < 100) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();

		i = 1;
		while (Math.pow(2, i) < 100) {

			System.out.printf("%.0f ", Math.pow(2, i));

			i++;
		}

	}

}
