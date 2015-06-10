
public class Palindrome {

	public static void main(String[] args) {
		String car1= "A Santa dog lived as a devil God at NASA";
		String car2="lexus";
		
		boolean iscar1= IsPalindrome(car1);
		boolean iscar2 = IsPalindrome(car2);
		
		if(iscar1)
		{
			System.out.println(car1 + " is a palindrome");
		}
		else
		{
			System.out.println(car1 + " is not a palindrome");
		}
		if (iscar2)
		{
			System.out.println(car2 + " is a palindrome");
		}
		else
		{
			System.out.println(car2 + " is not a palindrome");
		}
	}
	public static boolean IsPalindrome(String originalpalindrome)
	{
		boolean IsPalindrome= true;
		if (originalpalindrome!=null)
		{
			String withoutspaces = originalpalindrome.replace(" ","").toLowerCase();
			char[] originalpalindromechar= withoutspaces.toCharArray();
			for (int i =0,k = originalpalindromechar.length -1; i< originalpalindromechar.length/2; i++,k--)
			{
				if (originalpalindromechar[i] != originalpalindromechar[k])
				{
					IsPalindrome = false;
					break;
				}
			}
		}
	
		else
		{
			System.out.println("You gave me a null string.");
		}
		return IsPalindrome;
		}
}
