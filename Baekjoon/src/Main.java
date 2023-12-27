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
				if (sa[j].length() > sa[j + 1].length()) {
					String temp = sa[j];
					sa[j] = sa[j + 1];
					sa[j + 1] = temp;
					isSwap = true;
				} else if (sa[j].length() == sa[j + 1].length()) {
					if (sa[j].compareTo(sa[j + 1]) > 0) {
						String temp = sa[j];
						sa[j] = sa[j + 1];
						sa[j + 1] = temp;
						isSwap = true;
					}
				}
			}
			if (isSwap == false) {
				break;
			}
		}
		
		String[] sa1 = Arrays.stream(sa).distinct().toArray(String[]::new);
		
		for (String string : sa1) {
			System.out.println(string);
		}
		
		
		scanner.close();
	}
}
