import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int range = 1;
		int count = 1;
		
		for (int i = 1; i < n; i++) {
			range += 6 * i;
			count++;
			if (n <= range) {
				break;
			}
		}
		
		System.out.println(count);
		
		scanner.close();
	}

}
