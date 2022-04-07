package io_ex;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopyEx {
	public static void main(String[] args) {
		File src = new File("c:\\dev\\test.txt"); //원본 파일 경로명
		File dest = new File("c:\\dev\\test2.txt"); //복사 파일 경로명
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read())!=-1) {//문자 하나 읽고
				fw.write((char)c);// 문자 하나 쓰고
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사 하였습니다.");
		}catch (IOException e) {
				System.out.println("파일 복사 오류");
			} 
		
	
}
}
