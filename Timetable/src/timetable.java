
import java.util.Scanner;


public class timetable {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int guess;
		
		System.out.println("Table length less than 35");
		guess = input.nextInt();

		int num;
	      for (int i = 1; i <= guess; i++) {
	         System.out.print(i);
	         if (i < 10) System.out.print("  ");
	         else if (i >=10) System.out.print(" "); 
	         for (int j = 1; j <= guess; j++) {
	        	 num = i*j;
	             System.out.print(" "+ num);
	             if (num < 10) System.out.print("     ");
	             else if (num < 100) System.out.print("    ");
	             else if (num >= 100) System.out.print("   ");
	             else if (num > 1000) System.out.print(num);

	          }
	          System.out.println();
	      }
	   } 
	}
