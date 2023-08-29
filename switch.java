class thing
{
public static void main(String args[])
{
int x=1,n=50,sum=0,mult=1;
while(x<=n)
{
if(x%2==0)
{
sum=sum+x;
}
else
{
mult=mult*x;
}
x++;
}
System.out.println("sum="+sum);
System.out.println(mult);
}
}





