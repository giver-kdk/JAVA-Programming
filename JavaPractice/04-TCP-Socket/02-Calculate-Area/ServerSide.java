package tcp_area;

import java.net.*;
import java.io.*;
import java.util.*;

class area_server{
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(1234);
		Socket cs = ss.accept();

		Scanner ins = new Scanner(cs.getInputStream());
		PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

		String rad = ins.nextLine();
		double radius = Double.parseDouble(rad);
		double area = Math.PI * radius * radius;

		System.out.println("From Client: " + rad);
		outs.println(area);

		ins.close();
		outs.close();
		cs.close();
		ss.close();
	}
}
