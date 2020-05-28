class Display
{
	public static void main(String args[])
	{
	
		String name,type,os;
		short ram;
		float price;
	
		name=args[0];
		type=args[1];
		os=args[2];
		ram=Short.parseShort(args[3]);
		price=Float.parseFloat(args[4]);
		Phone ph=new Phone();
		
		ph.setName(name);
		System.out.println("\nName of Phone : "+ph.getName());
		
		ph.setType(type);
		System.out.println("\nType of Phone : "+ph.getType());
		
		ph.setOs(os);
		System.out.println("\nOperating System : "+ph.getOs());
		
		ph.setRam(ram);
		System.out.println("\nRAM in GB : "+ph.getRam()+" GB");
		
		ph.setPrice(price);
		System.out.println("\nPrice in INR : "+ph.getPrice()+" Rs.");
	}
}