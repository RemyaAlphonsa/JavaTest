package string;

public class AssignQ1_2 {

	public static void main(String[] args) {
		
	 //Reverse string : iNeuron -> norueNi
		String s1 = "iNeuron";
		String s2 ="";
		
		for(int i=s1.length()-1; i>=0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);//norueNi
		
	 //Reverse the words in sentence : Think Twice -> knihT eciwT
        String s3 = "Think Twice";
        String s4 ="";
        
        String arr[] = s3.split(" ");
        for(int j=0; j<arr.length; j++) {
        	s4 = (s4 != "") ? s4 + " " : s4;
        	
        	for(int k=(arr[j].length() - 1); k>=0; k--) {
        		s4 = s4 + arr[j].charAt(k);
        	}
        }
        System.out.println(s4);//knihT eciwT
        
	}

}
