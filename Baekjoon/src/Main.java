import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		long gap = 0;
		
		if (n >= m) {
			gap = n - m;
		} else {
			gap = m - n;
		}
		
		System.out.println(gap);
		
		scanner.close();
	}
}
