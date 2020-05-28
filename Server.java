import java.net.*;
import java.io.*;
class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(15);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hello Client");
		System.out.println(dis.readUTF());
		s.close(); 
	}
}