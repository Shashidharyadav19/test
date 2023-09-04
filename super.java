class super1
{
public static void main(String args[])
{
int start=1,num=6,count=0;
while(start<=num)//1<=7
{
if(num%start==0)//6% 6==0//true//false
{
count++;//6
}
start++;//2 3 4 5 6 7
}
System.out.println(count+"count");
System.out.println(start+"startr");
if(count==3)
{
System.out.println(num+"super number");
}
else
{
System.out.println(num+" not super number");
}
}
}
