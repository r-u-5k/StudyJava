import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] na = new int[n];
		String s1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(s1);
		for (int i = 0; i < n; i++) {
			na[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(na);
		
		int m = Integer.parseInt(br.readLine());
		int[] ma = new int[m];
		String s2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(s2);
		for (int i = 0; i < m; i++) {
			ma[i] = Integer.parseInt(st2.nextToken());
		}
		
		
	}
}
