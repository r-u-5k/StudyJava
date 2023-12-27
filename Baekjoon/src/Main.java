import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); // nCk = n!/((n-k)!*k!)
		int k = scanner.nextInt();
		int a = 1, b = 1, c = 1;
		
		for (int i = 1; i <= n; i++) {
			a *= i;
		}
		for (int i = 1; i <= k; i++) {
			b *= i;
		}
		for (int i = 1; i <= n - k; i++) {
			c *= i;
		}
		
		System.out.println(a / (b * c));
		
		scanner.close();
	}
}
