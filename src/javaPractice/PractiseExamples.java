package javaPractice;

public class PractiseExamples {

	public static void main(String[] args) {
		//print $
		
		String str = "payment is $100";
		System.out.println(str.charAt(11));
		
		//find index of $
		String str1= "payments is $100";
		System.out.println(str1.indexOf("$"));
		
		System.out.println(str1.substring(8));
		
		System.out.println(str1.length()); 
		
		
		// reverse a string
		String s = "surya";
		String t = "";     // to check palindrome
		
		for(int i= s.length()-1; i>=0; i--)
		{
		System.out.println(s.charAt(i));
			
	    t= t + s.charAt(i);
		}
		
		System.out.println(t);
		
		
		
     if (s.equals(t))
     {
    	 System.out.println("yes,palindrome");
     }
     else 
     {
    	 System.out.println("no,palindrome"); 
     } 
	}
}
