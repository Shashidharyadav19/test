class primenot
{
public static void main(String args[])
{
int num=11,start=2,count=0,c=num;
while(start<=c)
{
if(num%c==0)
{
count++;
}
c--;
}
if(count==1)
{
System.out.println(num+"prime number");
}
else
{
System.out.println(num+" not prime number");
}
}
}
