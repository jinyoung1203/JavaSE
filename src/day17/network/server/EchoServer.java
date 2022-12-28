package day17.network.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * [[소켓(socket)]]
 * TCP/IP 기반 네트워트 통신에서 데이터 송수신의 마지막 접점을 말한다
 * 소켓통신 => 서버-클라이언트간 데이터를 주고받는 양방향 연결 지향성 통신
 * 
 * 
 * 
 * 
 */
public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket s = null;
		InputStream in = null;
		OutputStream out = null;
		
		//1. 3000번 port로 ServerSocket 객체생성
		try {
			serverSocket = new ServerSocket(3000);
			
			System.out.println("한글client waiting....");
			
			//2. accept() 메서드는 클라이언트의 요청이 들어오면
			//클라이언트와 통신할수있는 socket 객체를 생성한다
			s = serverSocket.accept();
			
			System.out.println("client accept...");
			
			//6.Socket객체를 이용해서 InputStream객체를 생성한다
			in = s.getInputStream();
			
			byte[] b = new byte[1024];
			
			//클라이언트에서 보낸 메세지 읽어서 저장
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b, 0, readByteCnt));
			
			out = s.getOutputStream();
			out.write(b, 0, readByteCnt );
			
			//8.응답데이터 만들기
			out.close();
			in.close();
			s.close();
			serverSocket.close();
			
			
		} catch (Exception e) {
		}finally {
			if(out !=null)out.close();
			if(in !=null)in.close();
			if(s !=null)s.close();
			if(serverSocket !=null)serverSocket.close();
		}
		
		
		
		
		
		
		
	}
}

