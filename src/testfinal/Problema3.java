package testfinal;

public class Problema3 {
	public static int nex(int[] arr, int n) {

		for (int i = 0; i < arr.length; i++) {

			if (n == arr[i]) {
				return arr[i] + 1;
			} else if (n == arr.length - 1) {
				return -1;
			} else {
				return -2;
			}
		}
	}
}
