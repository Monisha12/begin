import java.io.*;
import java.util.*;
class repeat
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int count=0;
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int arr1[]=new int[9];
for(int j=0;j<n;j++)
{
arr1[arr[j]]++;
}
for(int k=0;k<n;k++)
{
if(arr1[k]>1)
{
count++;
System.out.print(k +" ");
}
}
if(count==0)
{
System.out.println("unique");
}
}
}
