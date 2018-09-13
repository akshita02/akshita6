import java.util.*;
class palindrome{
public static void main(String[] args)
{
String original;
String reverse="";
Scanner in=new Scanner(System.in);
System.out.println("enter a string");
original=in.nextLine();
int length=original.length();
for(int i=length-1;i>=0;i--)
reverse=reverse+original.charAt(i);
if(original.equals(reverse))
{
System.out.println("True");
}
else{
System.out.println("False");
}
}
}