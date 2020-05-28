import java.net.*;
import java.io.*;
import java.util.Scanner;
class UDPServer
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket s = new DatagramSocket(15);
		byte[] b = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b,b.length);
		s.receive(dp);
		String msg = new String(dp.getData());
		System.out.println("Msg : "+msg);
		s.close();
	}
}