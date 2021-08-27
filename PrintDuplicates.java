package week3assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
public static void main(String[] args) {
	int[] a= {14,12,13,11,15,14,18,16,17,19,18,17,20};

	int count=0;
	Set<Integer> charSet = new LinkedHashSet<Integer>();
	Set<Integer> dupcharSet = new LinkedHashSet<Integer>();
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) 
		count++;
		}
		charSet.add(a[i]);
	    if(count>=1) 
		dupcharSet.add(a[i]);
	    count=0;
     	
		}
	    System.out.println("Duplicate integers: " + dupcharSet);

	    
}
}
