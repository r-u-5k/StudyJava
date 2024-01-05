import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		while (q.size() > 1) {
			q.poll();
			q.offer(q.poll());
		}
		
		bw.write(Integer.toString(q.poll()));
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
