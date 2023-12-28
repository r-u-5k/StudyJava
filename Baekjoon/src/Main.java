import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] subject = new String[20];
		String[] grade = new String[20];
		double[] score = new double[20];
		double[] credit = new double[20];
		double[] mulOfScoreCredit = new double[20];
		double sumOfCredit = 0;
		double sumAll = 0;
		
		for (int i = 0; i < 20; i++) {
			subject[i] = scanner.next();
			credit[i] = scanner.nextDouble();
			grade[i] = scanner.next();
		}
			
		for (int i = 0; i < 20; i++) { // 과목평점
			if (grade[i].equals("A+")) {
				score[i] = 4.5;
			} else if (grade[i].equals("A0")) {
				score[i] = 4.0;
			} else if (grade[i].equals("B+")) {
				score[i] = 3.5;
			} else if (grade[i].equals("B0")) {
				score[i] = 3.0;
			} else if (grade[i].equals("C+")) {
				score[i] = 2.5;
			} else if (grade[i].equals("C0")) {
				score[i] = 2.0;
			} else if (grade[i].equals("D+")) {
				score[i] = 1.5;
			} else if (grade[i].equals("D0")) {
				score[i] = 1.0;
			} else if (grade[i].equals("F")) {
				score[i] = 0.0;
			} else if (grade[i].equals("P")) {
				score[i] = 0.0;
			}
		}
		
		for (int i = 0; i < 20; i++) {
			if (!grade[i].equals("P")) {
				sumOfCredit += credit[i];
			}
		}
		
		for (int i = 0; i < 20; i++) {
			if (!grade[i].equals("P")) {
				mulOfScoreCredit[i] = score[i] * credit[i];
				sumAll += mulOfScoreCredit[i];
			}
		}
		
		System.out.println(sumAll / sumOfCredit);
		
		scanner.close();
	}
}
