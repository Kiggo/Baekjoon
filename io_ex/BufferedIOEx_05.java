package io_ex;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx_05 {
	public static void main(String[] args) {
		FileReader fin = null;
		BufferedOutputStream out = null;
		int c;
		try {
			fin = new FileReader("c:\\temp\\test2.txt");
			out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read())!=-1) {
				out.write(c);
			}
			//파일 데이터가 모두 출력된 상태
			
			new Scanner(System.in).nextLine();
			out.flush(); // 버퍼에 남아있던 문자 모두 출력
			fin.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 경로 상에 존재하지 않음");
		} catch (IOException e) {
			
		}
		
	}
}
