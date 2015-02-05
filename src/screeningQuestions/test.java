package screeningQuestions;

public class test {
	
	private static Integer[] array = {3,8,22,29,43,55,61,74,78,95,96};
	
	public static void main(String [] args){
		
		/* out should be as follows:
		 * -1
		 * (index of array)
		 * (index of array)
		 * -1
		 * -1
		 * 0
		 * (last index of array)
		 */
		
		//test n that doesn't exist
		System.out.println(binarySearch.binSearch(7,array));
		//test for a lower n
		System.out.println(binarySearch.binSearch(8,array));
		//test for a upper n
		System.out.println(binarySearch.binSearch(78,array));
		//test n < first index
		System.out.println(binarySearch.binSearch(1,array));
		//test n > last index
		System.out.println(binarySearch.binSearch(100,array));
		//test n as index 0
		System.out.println(binarySearch.binSearch(array[0],array));
		//test n as last index
		System.out.println(binarySearch.binSearch(array[array.length-1],array));
	}

}
