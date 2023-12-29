package nongeneric;

import java.util.ArrayList;

public class ArrayListMain {
	
	public static void main(String[] args) {
		Account acc1 = new Account(1111, "KIM", 56000, 0.9);
		Account acc2 = new Account(2222, "LEE", 58900, 0.5);
		Account acc3 = new Account(3333, "PARK", 78000, 0.4);
		Account acc4 = new Account(4444, "CHOI", 34000, 0.3);
		Account acc5 = new Account(5555, "SIM", 66000, 0.7);
		Account acc6 = new Account(6666, "HONG", 99000, 1.4);
		Account acc7 = new Account(7777, "KIM", 87600, 0.6);
		Account acc8 = new Account(8888, "SOO", 12300, 2.3);
		Account acc9 = new Account(9999, "MIN", 41200, 4.1);
		
		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("size: " + size);
		
		System.out.println("1. add(element) [맨 마지막 index에 element 추가]");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		System.out.println("size: " + accountList.size());
		System.out.println(accountList.toString()); // Account에서 재정의됨
		accountList.add(acc5);
		accountList.add(acc6);
		accountList.add(acc7);
		accountList.add(acc8);
		accountList.add(acc9);
		
		System.out.println("2. add(index, element) [지정된 index에 element 추가]");
		accountList.add(1, new Account(1112, "NEW", 30000, 3.3));
		System.out.println(accountList.toString()); // Account에서 재정의됨
		
		System.out.println("3. set(index, element) [지정된 index에 element 저장]");
		accountList.set(accountList.size() - 1, new Account(9900, "LAST", 65400, 5.5));
		System.out.println(accountList.toString()); // Account에서 재정의됨
		
	}
}
