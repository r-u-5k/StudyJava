import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		int[] money = new int[k];
		int sum = 0;
		
		for (int i = 0; i < k; i++) {
			money[i] = scanner.nextInt();
			for (int j = 0; j < i; j++) {
				if (money[i - j] == 0) {
					money[i - j - 1] = 0;
					j++;
				}
			}
		}
		
		for (int i = 0; i < money.length; i++) {
			sum += money[i];
		}
		
		System.out.println(sum);
		
		scanner.close();
	}
}
