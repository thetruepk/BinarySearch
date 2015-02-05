package screeningQuestions;

public class binarySearch {
	//If found return the index of the array
	//If not found returns -1
	//Print out examined index

	private static Integer searchArray(int min,int max,Integer[] integers,int target){
		int range = max - min;		
		int testPos = (range/2)+min;

		if(target == integers[min]){
			return min;
		}else if(target == integers[max]){
			return max;
		}else if(min > max){
			return -1;
		}
		
		//test target against lower half
		if(target < integers[testPos]){
			max = testPos-1;
			return searchArray(min,max,integers,target);
		//test target against upper half
		}else if(target > integers[testPos]){
			min = testPos+1;
			return searchArray(min,max,integers,target);
		//if previous fail then check testPos(mid-Point) for match
		}else if(target == integers[testPos]){
			return testPos;
		}
		return -1;
	}
	
	public static Integer binSearch(int n, Integer[] integers){
		//Check to see if n fits in the range of the array 
		if(n <= integers[integers.length-1] && n >= integers[0]){
			//If pass then search the array
			return searchArray(0,integers.length-1,integers,n);
		}
		return -1;
	}
}
