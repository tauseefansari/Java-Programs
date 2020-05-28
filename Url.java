import java.net.*;
class Url
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL(args[0]);
		System.out.println("Protocol : "+url.getProtocol());
		URLConnection ucon = url.openConnection();
		System.out.println("Content Type : "+ucon.getContentType());
	}
}