package week3assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment4 {

public static void main(String[] args) {

	String a="paypal";
	char[] ch=a.toCharArray();
	int count=0;
	Set<String> charSet = new LinkedHashSet<String>();
	Set<String> dupcharSet = new LinkedHashSet<String>();
	
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
		if(ch[i]==ch[j]) 
		count++;
		}
		charSet.add(Character.toString(ch[i]));
	    if(count>=1) 
		dupcharSet.add(Character.toString(ch[i]));
	    count=0;
     	
		}
	    System.out.println("Duplicate characters: " + dupcharSet);

	    charSet.removeAll(dupcharSet);
		System.out.println("string without duplicate");
		
		for(String str2: charSet)
			if(str2.isBlank() || str2.isEmpty())
				continue;
			else
					System.out.println(str2);
		
		
			}

}
