package week3assignments;

import java.util.ArrayList;
import java.util.List;

public class FindInteraction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };

	
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		for(int i =0; i<a.length;i++) {
			list.add(a[i]);
		}
		for(int i = 0;i<b.length;i++) {
			list2.add(b[i]);
		}
		
		
		list.retainAll(list2);
		System.out.println("numbers present in both arrays" +list);
}
}
