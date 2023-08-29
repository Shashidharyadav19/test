class insurance
{
	public static void main(String args[])
	{
	int age=27,a,b;
	String gender="male",lifestyle="poor";
	int policy;
	if(age>=25&&age<=35)
	{
	if(gender=="male"&&lifestyle=="rich")
	{
	a=4;
	b=1000;
	policy=200000*a/b;
	System.out.println("gender="+gender);
	System.out.println("lifestyle="+lifestyle);
	System.out.println("policy="+policy);
	}
	else if(gender=="male"&&lifestyle=="poor")
	{
	a=6;
	b=1000;
	policy=10000*a/b;
	System.out.println("gender="+gender);
	System.out.println("lifestyle="+lifestyle);
	System.out.println("policy="+policy);
	}
	else if(gender=="female"&&lifestyle=="rich")
	{
	a=3;
	b=1000;
	policy=200000*a/b;
	System.out.println("gender="+gender);
	System.out.println("lifestyle="+lifestyle);
	System.out.println("policy="+policy);
	}
	}
	else
	{
	System.out.println("person is not insured");	
	}
	}
	
}
	
	
	