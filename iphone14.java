class gagan
{
	public static void main(String[] args)
	{
	String name="iphone";
	double prize=79900;
	double discount=prize*14.0/100;
	System.out.println("discount="+discount);
	double offerprize=prize-discount;
	System.out.println("offerprize="+offerprize);
	double packingprize=99;
	double totalprize=(offerprize+packingprize);
	System.out.println("totalprize="+totalprize);
	double bankoffer=5.0/100*totalprize;
	System.out.println("bankoffer="+bankoffer);
	totalprize=totalprize-bankoffer;
	System.out.println("totalprize="+totalprize);
	double exchange=7000;
	double finalprize=totalprize-exchange;
	System.out.println("finalprize="+finalprize);




	}
}
