package testfinal;

public class MediaArmonica {
	public static double harmonicAvg(int a, int b) {
		double media = ((a * a * b) / (a + b));
		if (a + b == 0) {
			return 0;
		} else {
			return media;
		}
	}

	public static void main(String[] args) {
		System.out.println(harmonicAvg(7, 8));
	}

}
