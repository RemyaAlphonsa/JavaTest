package string;

import java.util.Arrays;
import java.util.Scanner;

public class AssignQ3_Anagram {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
       System.out.println("Enter string1 :");       
       String str1 = sc.nextLine();
       System.out.println("Enter string2 :");
       String str2 = sc.nextLine();
   
       Anagram res = new Anagram();
       Boolean result = res.anagramNumCheck(str1,str2);
       
       if(result) {
    	   System.out.println("It is Anagram");
       }else {
    	   System.out.println("It is not Anagram");
       }
       
	}

}
class Anagram{
	String str1;
	String str2;	
	
	public Boolean anagramNumCheck(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}
}
