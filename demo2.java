import java.util.*;
class demo2 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter name to be printed");
 String s=sc.next();
int size=s.length()+2;
	  int n=7,m=22;
 for(int i=1;i<=n;i++)
{
  for(int j=1;j<=m;j++)
{
  if(i==1 ||i==n)
{
 if(j==1 ||j==m)
{
System.out.print("+");
}
else
{
System.out.print("-");
}

}
if( i==2||i==3||i==4||i==5||i==6)
{
if(j==1 ||j==m)
{
System.out.print("|");
}
else
System.out.print(" ");
}
if(i== n-2 && j==m-(s.length()+2))
{
for(int k=0;k<s.length();k++)
System.out.print(s.charAt(k));
 j=j+s.length();
}
}
System.out.println(" ");
}
	}
}
