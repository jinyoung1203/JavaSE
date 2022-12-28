package day17.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://n.news.naver.com/article/016/0002083822?ntype=RANKING#body");
		//n.news.naver.com 서버주소
		//ntype=RANKING 파라메타
		String protocol = url.getProtocol();
		//protocol 규칙
		String host = url.getHost();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol: "+protocol);
		System.out.println("host: "+host);
		System.out.println("query: "+query);
		System.out.println("reference: "+reference);
	
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		
		char[] c = new char [1024];
		int readCharCnt = 0;
		while ((readCharCnt = isr.read(c)) != -1){
			System.out.println(new String(c, 0 ,readCharCnt));
		}
		isr.close();
		in.close();
	}
}
