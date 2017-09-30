import java.io.*;
import java.util.*;
class unique
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
  String str="";
  for(int l=0;l<arr.length;l++)
  {
    str=str+arr[l];
  }
for(int i=0;i<arr.length;i++)
{
  for(int j=i+1;j<arr.length;j++)
  {
    if(str.charAt(i)==str.charAt(j))
    {
      str=str.replace(str.charAt(i),' ');
    }
  }
}
  str=str.replace(" ","");
  System.out.println(str);
}
}
