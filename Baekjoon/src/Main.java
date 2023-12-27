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
		
		for (int i = 0; i < sa.length - 1; i++) {
			boolean isSwap = false;
			for (int j = 0; j < sa.length - 1 - i; j++) {
				if (sa[i].length() > sa[j].length()) {
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
					isSwap = true;
				} else if (sa[i].length() == sa[i].length()) {
					if (sa[i].compareTo(sa[j]) > 0) {
						String temp = sa[i];
						sa[i] = sa[j];
						sa[j] = temp;
						isSwap = true;
					}
				}
			}
			if (isSwap == false) {
				break;
			}
		}
		
		sa = Arrays.stream(sa).distinct().toArray(String[]::new);
		
		for (String string : sa) {
			System.out.println(string);
		}
		
		
		scanner.close();
	}
}
