package charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderBufferedWriterCopyMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("죄와벌[복사].txt"));
		/*
		String readLine = br.readLine();
		System.out.println("1. " + readLine);
		readLine = br.readLine();
		System.out.println("2. " + readLine);
		*/
		while (true) {
			String readLine = br.readLine();
			if (readLine == null) break;
		}
		
		
	}

}
