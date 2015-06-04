
public class ReverseString {
private static char[] originalStringCharacters;


public static void main(String[] args)
{ String originalString = "hello";
String reversedString= ReverseInPlace(originalString);
System.out.println(reversedString);
}

	public static String ReverseInPlace(String originalString)
	{
	String reversedString = null;
	if (originalString!=null)
		{
		char[] originalStringCharacters = originalString.toCharArray();
		
		for (int i=0, j=originalStringCharacters.length-1;i < originalStringCharacters.length/2;i++, j--)
		{
			char temp= originalStringCharacters[j];
			originalStringCharacters[j]=originalStringCharacters[i];
			originalStringCharacters[i]=temp;
		}
		reversedString = new String(originalStringCharacters);
		}
	return reversedString;
		}


public static String ReversedOutOfPlace(String originalString)
{ String reversedString =null;
if (originalString != null)
{
char[] originalStringCharacters = originalString.toCharArray();
char[]reversedCharacters= new char[originalStringCharacters.length];

for (int i = 0,j = originalStringCharacters.length;i < originalStringCharacters.length;i++,j--)
{
	reversedCharacters[j]= originalStringCharacters[i];
}
reversedString= new String(reversedCharacters);
}

return reversedString;
}
}

	

