package string;

public class AssignQ7_8_count_vowel_consnent_spclCharctr {

	public static void main(String[] args) {
		String name = "!@Remy%aJ";
		String vowel = "aeiouAEIOU";
		int vowCount = 0;
		int consentCount = 0;
		int specCharCount = 0;
		String vow ="";
		String cons ="";
		String spcChar ="";
		
		for(int i=0;i<name.length();i++) {
			if((name.charAt(i) >= 'a' && name.charAt(i) <='z') || (name.charAt(i) >= 'A' && name.charAt(i) <='Z')) {
				if(vowel.indexOf(name.charAt(i)) != -1) {
					vow = vow + name.charAt(i);
					vowCount++;
				}else {
					consentCount++;
					cons = cons + name.charAt(i);
				}
			} else {
				specCharCount++;
				spcChar = spcChar + name.charAt(i);
			}
		}
		System.out.println("vowels in sentence : " + vow + "\tCount : "+vowCount);
		System.out.println("consonent in sentence : " + cons + "\tCount :"+consentCount);
		System.out.println("special char in sentence : " + spcChar + "\tCount :"+specCharCount);
	}

}
