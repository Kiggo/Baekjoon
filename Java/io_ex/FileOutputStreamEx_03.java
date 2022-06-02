package io_ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_03 {
	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Temp\\test.out");
			for(int i = 0; i<b.length; i++)
				fout.write(b[i]); //배열 b의 바이너리를 그대로 기록
			fout.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		}catch(IOException e){
			System.out.println("파일 입출력 오류");
		}
		System.out.println("c:\\Temp\\test.out 파일을 저장하였습니다");
	}
}
