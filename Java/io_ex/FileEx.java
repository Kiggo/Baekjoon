package io_ex;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+","+f1.getParent()+","+f1.getName());
		String res = "";
		if(f1.exists()) res = "파일";
		else if(f1.isDirectory()) res = "디렉토리";
		System.out.println(f1.getPath()+"은 "+res+"입니다");
		
		File f2 = new File("c:\\temp\\java_sample");
		if(!f2.exists()) 
			f2.mkdir();
		else
			System.out.println("디렉토리가 있음");
		listDirectory(new File("c:\\windows"));
	}
	private static void listDirectory(File file) {
		System.out.println(file.getPath()+"의 서브 리스트");
		File[] subFiles = file.listFiles();
		for(int i = 0; i<subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t파일크기: "+f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}
}
