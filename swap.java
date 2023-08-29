class swap
{
	public static void main(String[] args)
	{
	byte b=48;
	byte s=24;
	System.out.println(b+" "+s);
	s=(byte)(b+s);//48+24=62
	b=(byte)(s-b);//62-24=48
	s=(byte)(s-b);//48-24=24
	System.out.println(b+" "+s);
	}
}