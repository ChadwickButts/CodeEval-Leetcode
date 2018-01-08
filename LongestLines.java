package CodeEval;

import java.security.SecureRandom;
import java.util.*;

public class LongestLines {
	private static void quicksort(List<String> array, int lo, int hi) {
		if (hi <= lo) return;
		int lt = lo, gt = hi, i = lo;
		
		// random pivot effort
		SecureRandom randPiv = new SecureRandom();
		int rand =  randPiv.nextInt(hi);
		int pivot = array.get(rand).length();
		
		while (i <= gt) {
			String temp;
			if (array.get(i).length() > pivot ) {
				temp = array.get(i);
				array.set(i, array.get(lt));
				array.set(lt, temp);
				i++;
				lt++;
			} else if (array.get(i).length() < pivot ) {
				temp = array.get(i);
				array.set(i, array.get(gt));
				array.set(gt, temp);
				gt--;
			} else {
				i++;
			}
		}
		quicksort(array, lo, lt-1);
		quicksort(array, i, hi);
	}
	public static void lengthSort(List<String> arr, int numToPrint) {
		LongestLines.quicksort(arr, 0, arr.size()-1);
		for(int i = 0; i < numToPrint; i++) {
			System.out.println(arr.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numToPrint = 2;
		List<String> lines = new ArrayList<>(); 
		lines.add("Hello World");
		lines.add("CodeEval");
		lines.add("Quick Fox");
		lines.add("A");
		lines.add("San Francisco");

		
		LongestLines.lengthSort(lines,numToPrint);
	}

}
