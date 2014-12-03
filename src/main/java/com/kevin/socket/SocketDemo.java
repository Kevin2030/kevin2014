package com.kevin.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SocketDemo {

	public static void main(String[] args) {
		ScheduledExecutorService service = ScheduledExecutorServiceFactory.getInstance();
		service.execute(new MySocketServer(8888));
		service.scheduleWithFixedDelay(new MySocketClient(), 1, 2, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new MySocketClient(), 2, 2, TimeUnit.SECONDS);
	}

}

/**
 * 定时服务
 * 
 * @author Kai.Zhao
 * @date Jan. 9th, 2015
 * @since 1.0
 */
class ScheduledExecutorServiceFactory {
	private static final int corePoolSize = 30;
	private static ScheduledExecutorService instance = Executors.newScheduledThreadPool(corePoolSize);

	public static ScheduledExecutorService getInstance() {
		return instance;
	}
}

/**
 * 服务器
 * 
 * @author Kai.Zhao
 * @date Jan. 9th, 2015
 * @since 1.0
 */
class MySocketServer implements Runnable {

	private int port;

	public MySocketServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("Client Connecting[" + socket.getInetAddress() + "]");
				doSomething(socket);
			}
		} catch (IOException e) {
			e.printStackTrace();
			ScheduledExecutorServiceFactory.getInstance().execute(new MySocketServer(port));
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 执行业务逻辑
	 * 
	 * @param socket
	 * @author Kai.Zhao
	 * @throws IOException 
	 * @since 1.0
	 */
	public void doSomething(Socket socket) throws IOException {
		if (socket != null && socket.isConnected()) {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				if ((Integer.valueOf(line) + 5) % 10 == 0) {// 测试代码: 致使服务器重启
					throw new IOException();
				}
				System.out.println("Server Recieve Message From Client[" + socket.getInetAddress() + "]:" + line);
			}
			bufferedReader.close();
			socket.close();
		}
	}

}

/**
 * 客户端
 * 
 * @author Kai.Zhao
 * @date Jan. 9th, 2015
 * @since 1.0
 */
class MySocketClient implements Runnable {

	private static Integer times = 0;

	public void run() {
		synchronized (times) {
			Socket socket = null;
			try {
				socket = new Socket("localhost", 8888);
				PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
				printWriter.write(String.valueOf(times++));
				printWriter.flush();
				printWriter.close();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
