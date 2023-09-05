class prime
{
public static void main(String args[])
{
int start=1,num=5,count=0,end=num;
while(start<=end)
{
if(end%start==0)
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
