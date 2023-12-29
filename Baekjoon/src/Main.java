import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		boolean str = false;
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			if (s.indexOf(s, i))
		}
		
		
		
		
		
		
		if (str == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		scanner.close();
	}
}
