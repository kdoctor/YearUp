import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a new day of week:\n");
		String day = scanner.next();
		System.out.println("I read this day of week " + day);
		DayofWeek dayofWeekEvaluator = new DayofWeek();
		dayofWeekEvaluator.EvaluateDayOfWeek(day);
		scanner.close();
	} 

		
		public void EvaluateDayOfWeek(String dayofWeek) 
		{
			if (dayofWeek != null)
			{ 
			if (dayofWeek.equalsIgnoreCase("monday")
			||dayofWeek.equalsIgnoreCase("tuesday")
			||dayofWeek.equalsIgnoreCase("wednesday")
			||dayofWeek.equalsIgnoreCase("thursday")
			||dayofWeek.equalsIgnoreCase("friday"))
			{
					System.out.println(dayofWeek + " is a weekday. I will be at YearUp.");
			}
				else if (dayofWeek.equalsIgnoreCase ("saturday")
						||dayofWeek.equalsIgnoreCase ("sunday"))
				{
					System.out.println(dayofWeek + " is a weekend. Sleep in until 12.");
				}
				else 
				{
					System.out.println(dayofWeek + " is not a valid day.");
				}
				}
				}
}
	
        





