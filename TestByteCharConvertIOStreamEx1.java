package tw.myweng.javaproject.oop.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteCharConvertIOStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/hello.txt");
//		InputStreamReader isr1 = new InputStreamReader(fis1);
		
		InputStreamReader isr1 = new InputStreamReader(new FileInputStream("c:/temp/test/hello.txt"),"UTF-8");
		
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/result.txt");
//		OutputStreamWriter osw1 = new OutputStreamWriter(fos1);

		OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("c:/temp/test/result.txt"));
		
		
		int data;
		while((data = isr1.read())!=-1) {
			System.out.print((char)data);
			osw1.write("hello"+data);
		}
//		System.out.println("\n"+osw1);

		osw1.close();
		isr1.close();
	}

}