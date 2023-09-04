class factorial1
{
public static void main(String args[])
{
int i=1,factorial=1,num=6;
System.out.println("num"+num);
while(i<=num)
{
factorial=factorial*num;
System.out.println("factorial="+factorial);
num--;
}
}
}