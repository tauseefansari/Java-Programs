class Typecasting
{
	public static void main(String arg[])
	{
		System.out.println("\n\t\t\tImplicit Typecasting ");
		byte a=10;
		short b=a;
		int c=a;
		long d=a;
		float e=a;
		double f=a;
				
		System.out.println("\n\nByte : " +a);
		System.out.println("\nByte to Short : " +b);
		System.out.println("\nByte to Integer : " +c);
		System.out.println("\nByte to Long : " +d);
		System.out.println("\nByte to Float : " +e);
		System.out.println("\nByte to Double : " +f);
		
		
		short sh=120;
		int ca=sh;
		long da=sh;
		float ea=sh;
		double fa=sh;
		
		System.out.println("\n\nShort : " +sh);
		System.out.println("\nShort to Integer : " +ca);
		System.out.println("\nShort to Long : " +da);
		System.out.println("\nShort to Float : " +ea);
		System.out.println("\nShort to Double : " +fa);

		int cb=145;
		long db=cb;
		float eb=cb;
		double fb=cb;
				
		System.out.println("\n\nInteger : " +cb);
		System.out.println("\nInteger to Long : " +db);
		System.out.println("\nInteger to Float : " +eb);
		System.out.println("\nInteger to Double : " +fb);
		
		long dc=456;
		float ec=dc;
		double fc=dc;
		
		System.out.println("\n\nLong : " +dc);
		System.out.println("\nLong to Float : " +ec);
		System.out.println("\nLong to Double : " +fc);
		
		float ed=34.7f;
		double fd=ed;
		
		System.out.println("\n\nFloat : " +ed);
		System.out.println("\nFloat to Double : " +fd);
		
		char xa='T';
		int xb=xa;
		long xc=xa;
		float xd=xa;
		double xe=xa;

		System.out.println("\n\nCharacter : " +xa);
		System.out.println("\nCharacter to Integer : " +xb);
		System.out.println("\nCharacter to Long : " +xc);
		System.out.println("\nCharacter to Float : " +xd);
		System.out.println("\nCharacter to Double : " +xe);
		
		System.out.println("\n\t\t\tExplicit Typecasting" );
		
		double g=12345;
		float h=(float)g;
		long i=(long)g;
		int j=(int)g;
		short k=(short)g;
		char cc=(char)g;
		byte l=(byte)g;
		
		System.out.println("\n\nDouble : " +g);
		System.out.println("\nDouble to Float : " +h);
		System.out.println("\nDouble to Long : " +i);
		System.out.println("\nDouble to Integer : " +j);
		System.out.println("\nDouble to Short : " +k);
		System.out.println("\nDouble to Character : " +cc);
		System.out.println("\nDouble to Byte : " +l);	

		float ha=23.7f;
		long ia=(long)ha;
		int ja=(int)ha;
		short ka=(short)ha;
		char ff=(char)ha;
		byte la=(byte)ha;
		
		System.out.println("\n\nFloat : " +ha);
		System.out.println("\nFloat to Long : " +ia);
		System.out.println("\nFloat to Integer : " +ja);
		System.out.println("\nFloat to Short : " +ka);
		System.out.println("\nFloat to Character : " +ff);
		System.out.println("\nFloat to Byte : " +la);

		long ib=157;
		int jb=(int)ib;
		short kb=(short)ib;
		char gg=(char)ib;
		byte lb=(byte)ib;
		
		System.out.println("\n\nLong : " +ib);
		System.out.println("\nLong to Integer : " +jb);
		System.out.println("\nLong to Short : " +kb);
		System.out.println("\nLong to Character : " +gg);
		System.out.println("\nLong to Byte : " +lb);
		
		int jc=79;
		short kc=(short)jc;
		char cd=(char)jc;
		byte lc=(byte)jc;
		
		System.out.println("\n\nInteger : " +jc);
		System.out.println("\nInteger to Short : " +kc);
		System.out.println("\nInteger to Character : " +cd);
		System.out.println("\nInteger to Byte : " +lc);
		
		short kd=17;
		char ce=(char)kd;
		byte ld=(byte)kd;
		
		System.out.println("\n\nShort : " +kd);
		System.out.println("\nShort to Character : " +ce);
		System.out.println("\nShort to Byte : " +ld);
		
		char ke='a';
		byte je=(byte)ke;
		
		System.out.println("\n\nCharacter : " +ke);
		System.out.println("\nCharacter to Byte : " +je);
	}
}