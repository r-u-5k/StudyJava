package charstream;

import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("FileWriter.txt");
		
		fw.write(44356);
		fw.write('A');
		fw.write('김');
		for (int i = 0; i < 65536; i++) {
			fw.write(i);
			if (i % 100 == 0) {
				fw.write('\n');
			}
		}
		fw.close();
		System.out.println("FileWriter.write() -> FileWriter.txt");
		
	}

}
