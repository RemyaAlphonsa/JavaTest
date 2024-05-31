package string;

public class AssignQ4_Pangram {

	public static void main(String[] args) {
		
		String name = "I am a boy";
		String check = "The quick brown fox jumps over the lazy dog";
		String alph = "abcdefghijklmnopqrstuvwxyz";
		Boolean result = isPangram(alph.toLowerCase());
		if(result) {
			System.out.println("is Pangram");
		}else {
			System.out.println("is not pangram");
		}
	}
	public static boolean isPangram(String str) {
		

		if(str.length() < 26) {
           return false;
		}else {
			for(char ch='a';ch<='z';ch++) {
				if(str.toLowerCase().indexOf(ch)< 0) {
					return false;		
				}
			}
		   return true;
	    }
	}
}
