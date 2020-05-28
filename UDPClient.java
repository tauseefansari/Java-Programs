import java.net.*;
import java.io.*;
import java.util.Scanner;
class UDPClient
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		DatagramSocket s = new DatagramSocket();
		System.out.println("Enter Msg : ");
		String str=sc.next();
		byte[] sd = new byte[1024];
		sd=str.getBytes();
		InetAddress ip= InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(sd,sd.length,ip,15);
		s.send(dp);
		s.close();
	}
}