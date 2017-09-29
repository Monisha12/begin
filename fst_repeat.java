import java.io.*;
import java.util.*;
class fst_repeat
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int res=0;
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
res=arr[j];
break;
}
}
}
System.out.println(res);
}
}
