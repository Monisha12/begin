import java.io.*:
import java.util.*:
class indexequal
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str="";
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
if(n>=1 && n<=100000)
{
for(int j=0;j<n;j++)
{
if(arr[j]==j)
{
str=str+arr[j];
}
}
char arr1[]=str.toCharArray();
Arrays.sort(arr1);
for(int k=0;k<arr1.length;k++)
{
System.out.print(arr1[k] +" ");
}
if(str.isEmpty()==true)
System.out.println("-1");
}
}
}
