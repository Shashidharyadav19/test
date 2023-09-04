class superleap
{
public static void main(String args[])
{
int year=1947,x=0;
while(year<=2024)
{
if(year%4==0&&year%100!=0||year%400==0)
{
System.out.println("leap"+year);
x++;
System.out.println(x);
}
year+=12;
year++;
}
}
}