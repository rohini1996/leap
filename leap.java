import java.io.*;
import java.util.Scanner;
class leap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
long year=s.nextLong();
if((year%400==0)||(year%4==0)&&(year%100!=0))
{
System.out.println("leap year");
}
else
{
System.out.println("non leap year");
}
}
}
