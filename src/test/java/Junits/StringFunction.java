package Junits;

public class StringFunction {
	public static boolean isPalindrom (String str) {
		//str = madam
		//str = "madam";
		String nstr="";
		char ch;
		
		//while (i<end) {
			//if (str.charAt(i) != str.charAt(end)) {
				//return false;
			//}
			//i ++;
			//end --;	
		//}
		System.out.println(str);
		for (int end=0;end<str.length();end++) {
			ch = str.charAt(end);
			nstr = ch + nstr;
			System.out.println(nstr);
		}
		System.out.println(nstr);
		if(str.equals(nstr)) {
			return true;
		}
		return false;
		
	}
	
}
