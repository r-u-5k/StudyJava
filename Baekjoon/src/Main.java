import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			for (int j = 0; j < s.length(); j++) {
				if (s.indexOf("()") != -1) {
					s.replace("()", "");
				} else {
					break;
				}
			}
			if (s == "") {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
				
		}
		
	
		
		scanner.close();
	}
}
