package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost",7908)); //ServerSoket 생성
			while(true) {
				System.out.println("연결 기다림!!!");
				Socket socket = server.accept(); //클라이언트 연결 수락
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("연결 수락함"+isa.getHostName());
				
				byte []	bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readyByteCount = is.read(bytes);
				message = new String(bytes,0,readyByteCount,"UTF-8");
				System.out.println("데이터 받기 성공 : "+message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("데이터 보내기 성공");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!server.isClosed()) { //ServerSocket이 닫혀있지 않을 경우
			try {
			server.close(); //ServerSocket 닫기
			}catch(Exception e) {}
		}
	}
}
