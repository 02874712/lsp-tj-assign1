package org.howard.edu.lsp.assignment2.combination;
import java.util.ArrayList;

/***
 * 
 * @author tahiana
 *
 */
public class Combination {
	
	/***
	 * This function takes in the two parameters and complies an ArrayList
	 * of target combinations up to a given sum, in which it returns, by using for
	 * loops to loop through a given array
	 * 
	 * @param array - integer array containing combinations
	 * @param target - integer value of the target sum
	 * @return array15 - arrayList of string values containing target combinations
	 */
	public ArrayList<String> calCombinations (int[] array, int target){
		ArrayList<String> array15 = new ArrayList<String>();
		
		for(int i = 0; i < array.length; i++ ) {
			if (array[i] == target) {
				array15.add("["+ i + "]");
			}
			for(int j = 1; j < array.length; j++) {
				if(array[i] + array[j] == target && i != j) {
					array15.add("["+ i + "," +  j + "]");
					
				}
				for(int k = 2; k < array.length; k++) {
					if(array[i] + array[j] + array[k] == target && i!=j && j!=k && i!=k) {
						array15.add("["+ i + "," +  j +"," +  k + "]");
					}
				}
			}
	
		}
		
		return array15;
		
	}
}
