package io_ex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("c:\\temp\\test.txt");
			while(true) {
				System.out.print("문장을 입력하세요: ");
				String line = sc.nextLine();
				//키보드에서 입력 값이 없으면 break; 한다
				if(line.length()==0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2); //입력후 파일에 개행문자를 처리해준다 처음부터 2개까지
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류!!!");
		}
		System.out.println("종료");
	}
}
