class Age
{
	public static void main (String args[])
	{
	int birth=1900;
	int present=2023;
	int age=present-birth;
	System.out.println("age="+age);
	int days=365*age;
	System.out.println("days="+days);
	int hours=days*24;
	System.out.println("hours="+hours);
	double min=hours*60;
	System.out.println("min="+min);
	double sec=min*60;
	System.out.println("sec="+sec);
	}
}
