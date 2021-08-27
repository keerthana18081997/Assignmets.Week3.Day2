package week3assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,7,6,8};
	List<Integer> list=new ArrayList<Integer>();
	for(int i =0; i<arr.length;i++) {
		list.add(arr[i]);
	}
	Collections.sort(list);
	int j = 1;
	for (Integer a : list) {
		if (j != a) {
			System.out.println(" missing element " + j);
			break;
		}
		j++;
}
}
}
