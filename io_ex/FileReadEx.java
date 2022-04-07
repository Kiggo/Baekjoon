package io_ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\windows\\system.ini"); //파일을 open()
			int n;
			System.out.println("파일 있음");
			// System.out.println(fin.read());
			while((n=fr.read())!=-1) { 
				System.out.print((char)n);
			}
			fr.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일이 경로 상에 존재하지 않음");
		} catch (IOException e) {
			System.out.println("파일 입출력 오류!!!");
		}
		
		System.out.println("종료");
	}
}
