class primenot
{
public static void main(String args[])
{
int num=11,start=1,count=0,c=num;
while(start<=c)
{
if(num%c==0)
{
count++;
}
c--;
}
if(count==2)
{
System.out.println(num+"prime number");
}
else
{
System.out.println(num+" not prime number");
}
}
}
