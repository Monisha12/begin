import java.io.*;
import java.util.*;
public class check
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a>0)
{
System.out.println("the no is positive");
}
else if(a<0)
{
System.out.println("the no is negative);
}
else if(a==0)
{
System.out.println("the no is zero");
}
else
{
 System.out.println("the input is not valid");
}
}
}
