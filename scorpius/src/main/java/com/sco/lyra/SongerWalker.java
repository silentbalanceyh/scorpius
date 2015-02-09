package com.sco.lyra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SongerWalker {

	public static void main(String args[]) {
		// 为姚贝娜祈祷
		String voteUrl = "http://codemonkey.baidu.com/bin/index.php?ie=utf-8&oe=utf-8&format=json&client_token=6f9457d701eb9fc2967a0836ecb60d3b&client_id=63&add_count=true&t=1421405271460&cb=ribless&callback=ribless&_=1421405269577";
		for( int i = 0; i < 500; i++ ){
			AngelSinger singer = new AngelSinger(voteUrl);
			singer.start();
		}
	}
}

class AngelSinger extends Thread {

	private transient String targetUrl;

	public AngelSinger(final String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public void run() {
		try {
			URL urlAddress = new URL(this.targetUrl);
			URLConnection conn = urlAddress.openConnection();
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			conn.connect();
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder content = new StringBuilder();
			String line;
			while((line = in.readLine()) != null){
				content.append(line);
			}
			in.close();
			System.out.println(content);
		} catch (Exception ex) {
			ex.printStackTrace();
			this.interrupt();
		}
	}
}
