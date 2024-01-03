import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] basket = new int[n + 1];
		int temp = 0;
		
		for (int i = 1; i <= n; i++) {
			basket[i] = i;
		}
		
		for (int k = 0; k < m; k++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
			for (int a = i; a <= j; a++) {
				
			}
		}
	}

}
