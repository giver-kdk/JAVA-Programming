package tcp_area;

import java.net.*;
import java.io.*;
import java.util.*;

class area_client {

    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localhost", 1234);

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

        System.out.println("Enter the radius of circle: ");
        Scanner reader = new Scanner(System.in);
        String rad = reader.nextLine();

        outs.println(rad);
        String res = ins.nextLine();
        System.out.println("Area of Circle: " + res);

        ins.close();
        outs.close();
        cs.close();
    }
}
