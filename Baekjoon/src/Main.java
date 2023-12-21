import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/* n
		 * 1~1 -> 1개 / 1
		 * 2~7 -> 2개 / 6
		 * 8~19 -> 3개 / 12
		 * 20~37 -> 4개 / 18
		 */
		
		int n = scanner.nextInt();
		int r = 0;
		
		for (int i = 0; i < n; i++) {
			
		}
		
		
		if (n >= 0 && n < 2) {
			r = 1;
		}
		if (n >= 2 && n < 8) {
			r = 2;
		}
		if (n >= 8 && n < 20) {
			r = 3;
		}
		
		scanner.close();
	}
}

/*
int n = scanner.nextInt();
int num = 0;
for (int i = 0; i < n; i++) {
	if (i + i / 100 + (i % 100) / 10 + i % 10 == n) { // 3자리
		num = i;
		break;
	} else {
		num = 0;
	}
}
if i + (i의 각 자릿수들) = n

*/