package string;

import java.util.Arrays;

public class AssignQ5_6_repeatCharactr_sortAlpha {

	public static void main(String[] args) {
	//Repeated character in a string with count
		String s = "Reenna";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					System.out.println("Repeated character :: " + s.charAt(j) + " count:" + count);
				}
			}
		}
	//hashvalues
		System.out.println("A :" +Character.valueOf('A').hashCode() + "\tZ :" + Character.valueOf('Z').hashCode() + "\ta :" +Character.valueOf('a').hashCode() + "\tz :" +Character.valueOf('z').hashCode());
		
	 //sort String alphabetically
	    String name = "remya";
	    char sortedName[] =name.toCharArray();
	    char temp;
		for (int k = 0; k < sortedName.length; k++) {
			for (int m = k + 1; m < sortedName.length; m++) {
				if (sortedName[k] > sortedName[m]) {
					temp = sortedName[k];
					sortedName[k] = sortedName[m];
					sortedName[m] = temp;
				}
			}
		}
	    System.out.println("Asc sorted: "+Arrays.toString(sortedName));
	    
	  //desc order sorting
	    char nameArr[] =name.toCharArray();
	    char temp1;
		for (int ii = 0; ii < nameArr.length; ii++) {
			for (int jj = ii + 1; jj < nameArr.length; jj++) {
				if(nameArr[ii]<nameArr[jj]) {
					temp1=nameArr[ii];
					nameArr[ii]= nameArr[jj];
					nameArr[jj]=temp1;
				}
			}
		}
		System.out.println("Descending order sorted : " +Arrays.toString(nameArr));
	}

}
