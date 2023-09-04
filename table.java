class factorial
{
public static void main(String args[])
{
int i=1,factorial=1,num=6;
System.out.println("num"+num);
while(i<=num)
{
factorial=factorial*i;
System.out.println("factorial"+factorial);
i--;
}
}
}