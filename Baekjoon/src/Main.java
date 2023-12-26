import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		char[] c = new char[s.length()];
		int time = 0;
		
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'C') {
				time += 3;
			} else if (c[i] >= 'D' && c[i] <= 'F') {
				time += 4;
			} else if (c[i] >= 'G' && c[i] <= 'I') {
				time += 5;
			} else if (c[i] >= 'J' && c[i] <= 'L') {
				time += 6;
			} else if (c[i] >= 'M' && c[i] <= 'O') {
				time += 7;
			} else if (c[i] >= 'P' && c[i] <= 'S') {
				time += 8;
			} else if (c[i] >= 'T' && c[i] <= 'V') {
				time += 9;
			} else if (c[i] >= 'W' && c[i] <= 'Z') {
				time += 10;
			}
		}
		
		System.out.println(time);
		
		scanner.close();
	}
}
