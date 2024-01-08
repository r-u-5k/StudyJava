import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int x = 0;
			if (s.equals("push_front")) {
				x = Integer.parseInt(st.nextToken());
				arr.add(0, x);
			} else if (s.equals("push_back")) {
				x = Integer.parseInt(st.nextToken());
				arr.add(x);
			} else if (s.equals("pop_front")) {
				if (arr.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(arr.remove(0) + "\n");
				}
			} else if (s.equals("pop_back")) {
				if (arr.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(arr.remove(arr.size() - 1) + "\n");
				}
			} else if (s.equals("size")) {
				sb.append(arr.size() + "\n");
			} else if (s.equals("empty")) {
				if (arr.size() == 0) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			} else if (s.equals("front")) {
				if (arr.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(arr.get(0) + "\n");
				}
			} else if (s.equals("back")) {
				if (arr.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(arr.get(arr.size() - 1) + "\n");
				}
			}
		}

		System.out.println(sb);

	}
}
