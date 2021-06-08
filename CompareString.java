package JavaCodes;

import java.util.Scanner;

public class CompareString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1");
        String s1=sc.nextLine();
        System.out.println("Enter the string 2");
        String s2=sc.nextLine();

        System.out.println("String 1 is -" +s1);
        System.out.println("String 2 is -" +s2);

        int value = s1.compareToIgnoreCase(s2);

        if(value==0)
            System.out.println("They are equal.");
        else
            System.out.println("They are not equal.");

    }
}
