import java.util.*;
class SubSequence{

    public static void subsequences(String suffix,String prefix){
        if(prefix.length()<0)return;
        System.out.println(suffix);
        for(int i=0;i<prefix.length();i++)
         subsequences(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()));
    }

    public static void main (String args[]){
        subsequences("","abcd");
        }
}
