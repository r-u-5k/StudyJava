import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double[] score = new double[n];
		for (int i = 0; i < n; i++) {
			score[i] = scanner.nextInt();
		}
		Arrays.sort(score);
		double max = score[n - 1];
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			score[i] = score[i] * 100 / max;
			sum += score[i];
		}
		
		System.out.println(sum / n);
		
		scanner.close();
	}
}
