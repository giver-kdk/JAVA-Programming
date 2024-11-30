package tcp_project;

import java.net.*;
import java.io.*;
import java.util.*;

class ServerSide{
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(1234);
		Socket cs = ss.accept();

		Scanner ins = new Scanner(cs.getInputStream());
		PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

		Strinf mes = ins.nextLine();
		System.out.println("From Client: " + mes);
		outs.println("Hello Client");

		ins.close();
		outs.close();
		cs.close();
		ss.close();
	}
}
