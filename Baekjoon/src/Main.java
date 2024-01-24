import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> commentDeque = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			commentDeque.add(Integer.parseInt(br.readLine()));
		}
		int totPeople = commentDeque.size();
		int noReflectPeople = (int) Math.round(totPeople * 0.15);
		
		for (int i = 0; i < noReflectPeople; i++) {
			
		}
	}
}
