package CodeEval;
import java.util.*;

public class DetectingCycles {
	public static void findCycle(String[] arr) {
		Map<String, Integer> track = new HashMap<>();
		StringBuilder cycle = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (track.get(arr[i]) == null) {
				track.put(arr[i], 1);				
			} 
			else if (track.get(arr[i]) == 1) {
				track.put(arr[i], 2);
				cycle.append(arr[i] + " ");
			} 
			else {
				break;
			}
		}
		System.out.println(cycle);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] numbers = {"2", "0", "6", "3", "1", "6", "3", "1", "6", "3", "1"};
		String[] numb = {"3", "4", "8", "0", "11", "9", "7", "2", "5", "6", "10", "1", "49", "49", "49", "49"};
		String[] num = {"1", "2", "3", "1", "2", "3", "1", "2", "3"};
		String[] n = "1 2 3 1 2 3 1 2 3".split(" ");
		DetectingCycles.findCycle(n);
	}

}
