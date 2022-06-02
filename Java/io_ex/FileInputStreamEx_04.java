package io_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_04 {
	public static void main(String[] args) {
		byte b [] = new byte [6]; //비어있는 byte 배열
		FileInputStream fin = null;
		try {
			int n=0, c;
			fin = new FileInputStream("c:\\temp\\test.out");
			while((c = fin.read())!=-1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("c:\\temp\\test.out 에서 읽은 배열을 출력합니다.");
			for(int i = 0; i<b.length; i++) System.out.print(b[i]+" ");
			System.out.println();
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 경로 상에 없음");
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		
	}
}
