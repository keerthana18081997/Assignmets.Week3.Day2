package week3assignments;


import java.util.*;   

public class RemoveDuplicatesInString {
	
public static void main(String[] args) {
	String str="We learn java basics as part of java sessions in java week1";
	String[] split=str.split(" ");
	
	System.out.println("Original array: " 
            + Arrays.toString(split));
	
	LinkedHashSet<String> lhSetColors =  
            new LinkedHashSet<String>(Arrays.asList(split));
    
  
    String[] newArray = lhSetColors.toArray(new String[ lhSetColors.size() ]);
    
    System.out.println("Array after removing duplicates: " 
            + Arrays.toString(newArray));
	

}
}


