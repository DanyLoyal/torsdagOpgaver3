/*
1.a Skriv en metode printIfPalindrome() som tager en tekststreng som argument og printer den HVIS den kan skrives bagfra uden at ændre sig. (

Hint
1.b Sørg for at metoden ikke er case-sensitiv.

1.c Kald metoden fra main med argumentet "Den laks skal ned", for at teste den.
*/

class Laks
{
	public static void main(String[] args)
	{
		printIfPalindrom("Den laks skal ned");
	}
//creating a method
	static void printIfPalindrom(String stringPrint)
	{
		//creating string variables
		String stringToUpper = stringPrint.toUpperCase();
		String reverse = "";
//making a for loop
		for (int i = stringPrint.length()-1; i >= 0; i--)
		{
			reverse += stringToUpper.charAt(i);
		}
//if statement
		if (reverse.equals(stringToUpper))
		{
			System.out.println(stringPrint);
		}
		else 
		{
			System.out.println("Was not equal");
		}
	}
}