package io_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileHanhulEx_02 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		try{ 
			fin = new FileInputStream("hangul.txt");
			in = new InputStreamReader(fin,"MS949");
			int n;
			System.out.println("인코딩 문자 집합: "+in.getEncoding());
			while((n=in.read())!=-1) {
				System.out.print((char)n);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않은 한글 코드");
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		
	}
}
