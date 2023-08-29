class simple
{
	public static void main(String[] args)
	{
	double p=25,t=2,r=23;
	double si=p*t*r/100;
	System.out.println(si);
	double a=(1+r/100);
	System.out.println(a);
	double h=Math.pow(a,t);
	System.out.println(h);
	a=p*h;
	System.out.println(a);
	double ci=a-p;
	System.out.println(ci);
	
	
	}
}
	