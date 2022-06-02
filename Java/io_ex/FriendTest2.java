package io_ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class FriendTest2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException { //jvm이 예외처리
		Vector<Friend2> vc = new Vector<Friend2>();
		File dir = new File("c:\\temp");
		File file = new File(dir,"myfriend.dat");
		if(file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(file)));
			vc=(Vector)ois.readObject();
			ois.close();
		}
		
		while(true) {
			System.out.println("1.친구등록 2.전체보기 3.종료");
			int x = System.in.read()-48; //숫자 0:48  숫자 1:49 --> 49-48=1/ 1byte korea -> k
			//System.out.println(x);
			System.in.read(); //개행 문자 처리
			System.in.read();
			
			if(x==1) {
				//객체 단위 저장: List
				Friend2 f = new Friend2(); //입력 상태
				vc.add(f);
				System.out.println("친구 1명을 등록");
			}else if(x==2) {
				for(int i = 0; i<vc.size(); i++) {
				Friend2 f =(Friend2)vc.elementAt(i); //형변환
				f.disp();
				}
			}else if(x==3) { // 조건을 전부 적어주는게 좋다
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(//입출력속도향상
								new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.out.println("종료");
				System.exit(0);
			}else {
				
			}
		}
	}
}
