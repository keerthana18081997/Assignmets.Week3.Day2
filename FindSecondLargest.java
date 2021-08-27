package week3assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {

		
		int[] data = {3,2,11,4,6,7};
		List<Integer> list=new ArrayList<Integer>();
		for(int i =0; i<data.length;i++) {
			list.add(data[i]);
		}
		Collections.sort(list);
		int size=list.size();
		System.out.println("The second largest number is " + list.get(size - 2));
	}

}
