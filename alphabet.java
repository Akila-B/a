import java.io.*;
import java.util.*
class alphabet
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch=sc.next();
if(ch>='a' && ch<='z')
{
System.out.println(ch+ "is alphabet");
}
else
{
System.out.println(ch+"is not alphabet");
}
}
}
