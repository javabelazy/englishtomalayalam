package net.consumerfed.enmal.models;

/**
 * 
 */

/**
 * @author nijesh
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		String a = "he is the hero and hoero e vipinie kai";
		//String s= a.replaceAll("[A-Za-z]e\\b", "*"); // word ends with e
		//String s= a.replaceAll("[AEIOUaeiou]e", "*"); // followed by vowels
		//String s= a.replaceAll("^[AEIOUaeiou]e", "*"); 
		
		if(a.contains("ai"))
		{
			System.out.println(" found ai ");
		}
		System.out.println(s);
				
	}

}
