package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SerServer {
  public static void main(String args[]) {
    ServerSocket s = null;

    try {
      s = new ServerSocket(7908);
    } catch (IOException e){}

    while (true) {
      try {

	System.out.println("서버 실행 중!!!!");
	Socket s1 = s.accept();

        OutputStream  out = s1.getOutputStream();
        ObjectOutputStream dos = new ObjectOutputStream(out);
	Employee p = new Employee("홍길동","가나다 라마바사","121212-2323232");
        dos.writeObject(p);

        dos.close();
        s1.close();
      } catch (IOException e) {  
    	  e.printStackTrace();
      }
    }
  }
}