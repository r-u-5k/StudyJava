import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		int sum = 0;
		
		int[] money = new int[k];
		for (int i = 0; i < k; i++) {
			money[i] = scanner.nextInt();
			int a = 0;
			if (money[i - a] == 0) {
				money[i - a - 1] = 0;
				a += 2;
			}
		}
		
		for (int i = 0; i < money.length; i++) {
			sum += money[i];
		}
		
		System.out.println(sum);
		
		scanner.close();
	}
}
