<<<<<<< HEAD
package BigJavaCh06;

/**
 * This program simulates casting a die ten times.
 */
public class DieSimulator {
	public static void main(String[] args) {
		Die d = new Die(6);
		final int TRIES = 10;
		for (int i = 1; i <= TRIES; i++) {
			int n = d.cast();
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
=======
package BigJavaCh06;

/**
 * This program simulates casting a die ten times.
 */
public class DieSimulator {
	public static void main(String[] args) {
		Die d = new Die(6);
		final int TRIES = 10;
		for (int i = 1; i <= TRIES; i++) {
			int n = d.cast();
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
