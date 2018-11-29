import java.io.*;
import java.util.*;
public class product
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int mul=1;
int n=s.nextInt();
int arr[]=new Int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
mul=mul*arr[i];
}
System.out.println(mul);
}
}
