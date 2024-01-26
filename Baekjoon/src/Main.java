import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		int totPeople = list.size();
		int noReflectPeople = (int) Math.round(totPeople * 0.15);
		
		Collections.sort(list);
		for (int i = 0; i < noReflectPeople; i++) {
			list.remove(i);
			list.remove(list.size() - 1 - i);
		}
		
		int sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}
		
		int answer = (int) Math.round(sum * 1.0 / (totPeople - 2 * noReflectPeople));
		System.out.println(answer);
	}
}
