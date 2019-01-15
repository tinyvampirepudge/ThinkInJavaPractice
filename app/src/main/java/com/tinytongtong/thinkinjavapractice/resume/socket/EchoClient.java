package com.tinytongtong.thinkinjavapractice.resume.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	private final Socket mSocket;

	public EchoClient(String host, int port) throws UnknownHostException, IOException {
		// 创建socket并连接服务器
		mSocket = new Socket(host, port);
	}

	public void run() throws IOException {
		// 和服务端进行通信
		Thread readerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				readResponse();
			}
		});
		readerThread.start();

		OutputStream out = mSocket.getOutputStream();
		byte[] buffer = new byte[1024];
		int n;
		while ((n = System.in.read(buffer)) > 0) {
			out.write(buffer, 0, n);
		}
	}

	protected void readResponse() {
		try {
			InputStream in = mSocket.getInputStream();
			byte[] buffer = new byte[1024];
			int n;
			while ((n = in.read(buffer)) > 0) {
				System.out.write(buffer, 0, n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 由于服务器运行在统一主机，这里我们使用localhost
		EchoClient client;
		try {
			client = new EchoClient("localhost", 9877);
			client.run();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
