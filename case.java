import java.util.*;
class CaseChange
{

    public static void main(String[] args)
    {
        System.out.println("Enter in a string"); 
        Scanner input = new Scanner(System.in); 
        String original = input.nextLine();
        System.out.println("Converted String:" + toggleString(original));  
     }

    public static String toggleString(String original)
    {
       String toggled = ""; 
       for(int i=0; i<original.length(); i++)
       {
         char letter = original.charAt(i); 
         if(Character.isUpperCase(original.charAt(i)))
           {
                letter = Character.toLowerCase(letter); 
                toggled = toggled + letter; 

           }
           else if(Character.isLowerCase(original.charAt(i)))
           {
               letter = Character.toUpperCase(letter);
               toggled = toggled + letter; 
           }

       }
       return toggled; 

   }
}