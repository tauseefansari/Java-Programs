import java.util.*;
class StringOpertions
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;
		int letter=0,digit=0,space=0,word=1,special=0;
		System.out.print("\nEnter a String : ");
		str=sc.nextLine();
		System.out.print("\nEntered String is : "+str);
		char[] st=str.toCharArray();
 		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(st[i]))
				letter++;
			else if(st[i]==' ')
			{
				word++;
				space++;
			}
			else if(Character.isDigit(st[i]))
				digit++;
			else
				special++;
		}	
		System.out.print("\n\nAlphabets : "+letter);
		System.out.print("\nDigits : "+digit);
		System.out.print("\nSpecial Character : "+special);
		System.out.print("\nBlank Space : "+space);
		System.out.print("\nWord : "+word);
	}
}