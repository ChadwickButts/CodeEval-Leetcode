package CodeEval;

public class ArrayAbsurdity {
	
	public static void findDuplicate(int size,String[] arr) {
		int[] immutable = new int[size-1];
		for (int i = 0; i < immutable.length; i++) {
			immutable[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if (immutable[Integer.parseInt(arr[i])] == 0) {
				immutable[Integer.parseInt(arr[i])] += 1; 				
			} else {
				System.out.println(arr[i]);
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testCase1 = "5;0,1,2,3,0";
		String testCase2 = "20;0,1,10,3,2,4,5,7,6,8,11,9,15,12,13,4,16,18,17,14";
		
		String[] testCase = testCase2.split(";");
		
		ArrayAbsurdity.findDuplicate(Integer.parseInt(testCase[0]),testCase2.split(";")[1].split(","));
		
	}

}
