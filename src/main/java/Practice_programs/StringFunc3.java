package Practice_programs;

public class StringFunc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="shashi kumar yadav";
		String S="Shashi kumar yadav";
		 String[]SplitString =s.split("kumar");
		 System.out.println(SplitString[0]);
		 System.out.println(SplitString[1]);
		System.out.println(SplitString[1].trim());//trim to remove the white spaces
		for(int i=0;i<s.length();i++)//to print each and every character from the string
		{
			;
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--)//REVERSE OF A STRING
		{
		
			System.out.println( "REVERSE OF A STRING" + " "+s.charAt(i));
		}
	}
}
