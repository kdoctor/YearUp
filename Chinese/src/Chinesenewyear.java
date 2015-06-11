
public class Chinesenewyear {
		
		public void EvaluateChineseNewYear(int unknownyear){
							
			int knownyear = 1900;
			int yearDifference = unknownyear - knownyear;
			int remainder = yearDifference%12;
			
			switch(remainder)
			{
			case 0:
				System.out.println(unknownyear + " is the year of rat ");
				break;
				
			case 1:
				System.out.println(unknownyear + " is the year of ox ");
				break;
			case 2:
				System.out.println(unknownyear + " is the year of tiger ");
				break;
			case 3:
				System.out.println(unknownyear + " is the year of rabbit ");
				break;
			case 4:
				System.out.println(unknownyear + " is the year of dragon ");
				break;
			case 5:
				System.out.println(unknownyear + " is the year of snake ");
				break;
			case 6:
				System.out.println(unknownyear + " is the year of horse ");
				break;
			case 7:
				System.out.println(unknownyear + " is the year of sheep ");
				break;
			case 8:
				System.out.println(unknownyear + " is the year of monkey ");
				break;
			case 9:
				System.out.println(unknownyear + " is the year of rooster ");
				break;
			case 10:
				System.out.println(unknownyear + " is the year of dog ");
				break;
			case 11:
				System.out.println(unknownyear + " is the year of pig ");
				break;
			default:
				System.out.println("You must change your input.");
				break;
		
				}
			}

	public static void main(String[] args) {
		
		Chinesenewyear myyear = new Chinesenewyear();
		myyear.EvaluateChineseNewYear(1991);
		}
	}





