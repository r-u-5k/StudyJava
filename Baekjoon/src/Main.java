import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) break;
			String s = Integer.toString(n);
			boolean b = false;
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			System.out.println(b);
		}
		
		scanner.close();
	}
}
