import java.util.Scanner;
 class StringToCharArray {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String s;
		int count=0;
		System.out.print("Enter String:");
		s=sc.nextLine();
		
		char[] stringToCharArray = s.toCharArray();
 
		for (char output : stringToCharArray) {
			
			System.out.println(output);
			count++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			int ascii=(int)s.charAt(i);
			System.out.println("char "+stringToCharArray[i]+" = " +ascii);	
		}
	/*for (int aChar : stringToCharArray) {
    	System.out.println("chars = "+ aChar);*/
		
	}
}