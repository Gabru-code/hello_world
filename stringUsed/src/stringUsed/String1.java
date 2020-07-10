package stringUsed;
import java.util.*;
import java.io.*;

public class String1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = "This is string first";
		String s2 = new String("This is string second");
		String s3 = new String();
		System.out.println("Enter string");
		s3 = sc.nextLine();
		if((s1.equals(s3))||(s2.equals(s3)))
			System.out.println("Match");
		else System.out.println("Not Match");
		System.out.println(s1+s2);
		System.out.println("Enter string array");
		String s4[] = new String[5];
		for (int i=0;i<5;i++)
			s4[i] = sc.nextLine();
		System.out.println("Enter keyword");
		String temp = sc.nextLine();
		for(int i=0;i<5;i++)
		{
			if(temp.equals(s4[i]))
				System.out.println("Position number "+(i+1));
		}
				
	}

}
