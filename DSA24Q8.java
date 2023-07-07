// Find K Closest Elements
import java.util.ArrayList;
import java.util.List;

class SolutionK {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int start = 0;
        int end = arr.length - 1;
        while (end - start >= k) {
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}

public class DSA24Q8{
	public static void main(String args[])
	{
		SolutionK ob = new SolutionK();
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int x = 3, k = 4;
		List<Integer> l = ob.findClosestElements(arr, k, x);
		System.out.println(l);
		
	}
}

