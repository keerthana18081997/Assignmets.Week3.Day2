package week3assignments;

import java.util.Arrays;

public class Assignment3 {
	public static void main(String[] args) {
		String[] a= {"Google","Microsoft","TestLeaf","Maverick"};
		int l=a.length;
		Arrays.sort(a);
		for(int j=0;j<l;j++) {
			System.out.println("sorted order--" + a[j]);
		}
		//Collections.reverseOrder();
		System.out.println("------------------------------");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("Reverse order--" +a[i]);
		}
		
	}

}
