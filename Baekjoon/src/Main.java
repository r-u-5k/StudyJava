import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		String sa[] = new String[n];
		for (int i = 0; i < sa.length; i++) {
			sa[i] = scanner.nextLine();
		}
		
		Arrays.stream(sa);
		Arrays.sort(sa, (s1, s2) -> s1.length() - s2.length());
		
		for (String string : sa) {
			System.out.println(string);
		}
		
		scanner.close();
	}
}
