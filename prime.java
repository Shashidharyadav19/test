class prime
{
public static void main(String args[])
{
int start=1,num=4,count=0;
while(start<=num)
{
if(num%start==0)
{
count++;
}
start++;
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
