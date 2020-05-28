class AnimationName extends Thread
{
	public void run()
	{
		String name="TAUSEEF";
		char[] ar=name.toCharArray();
		System.out.println("Your Name :");
		for(int i=0;i<name.length();i++)
		{
			try
			{
				System.out.print(ar[i]+"\t");
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) 
	{
		AnimationName nam = new AnimationName();
		nam.start();
	}
}