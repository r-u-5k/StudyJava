import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.next();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		avg(a);
		
	}
	
	public static void avg(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(Math.round(sum * 1.0 / a.length));
	}
	
	public void mid(int[] a) {
		
	}
	
	public void freq(int[] a) {
		
	}
	
	public void range(int[] a) {
		
	}
}
