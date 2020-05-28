import java.net.*;
import java.io.*;
class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("localhost",15);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hello");
		System.out.println(dis.readUTF());
		s.close();
	}
}