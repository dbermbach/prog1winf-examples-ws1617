/**
 * 
 */

/**
 * @author Dave
 *
 */
public class Methods {

	public static void main(String[] args) {
		int[] meinArray = { 1, 2, 3, 4, 5 };
		long l = 123;
		method(meinArray, l);
		System.out.println("l:" + l);
		System.out.print("Array:");
		for (int i : meinArray)
			System.out.print(i + ",");
		double[] doubleArray = { 1, 2, 3, 4, 5, 6 };
		method2(4, doubleArray);
		// 42, 5, 6
		double[] neuesArray = new double[3];
		neuesArray[0] = 42;
		neuesArray[1] = 5;
		neuesArray[2] = 6;
		method2(0, neuesArray);
		method2(42, 5, 6);
	}

	public static void method(int[] array, long wert) {
		wert = 5;
		// double [] meinArray = null;
		array[0] = 42;
	}

	public static void method2(int i, double[] d) {
		System.out.print("\ni=" + i + "\nd=[");
		for (double dd : d) {
			System.out.print(dd + ",");
		}
		System.out.println("]");
		// ohne Komma am Ende:
		System.out.print("\ni=" + i + "\nd=[");
		for (int j = 0; j < d.length; j++) {
			if (j < d.length - 1)
				System.out.print(d[j] + ",");
			else
				System.out.print(d[j]);
		}
		System.out.println("]");

	}

	public static void method2(double... d) {
		method2(0, d);
	}

}
