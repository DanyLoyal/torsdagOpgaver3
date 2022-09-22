public class københavn{

	public static void main(String[] args) {
		printpartOfString("københavn", 1, 5);

	}

	public static void printpartOfString(String str, int a, int b){

		String by = str;
		String substr = by.substring(0);
		System.out.println(substr);
		String substr_2 = by.substring(a,b);
		System.out.println(substr_2);
	}
}