
public class NewSort {

	public static void main(String[] args) {
		int arr[] = {2,9,6,8,11,2,5,5,6};
	    int len = arr.length;
	    
	    for(int idx = 0; idx < len ;idx++){
	        int min = idx;
	        for(int i = idx; i < len; i++) if(arr[i] < arr[min]) min = i;
	        if(min != idx){
	            int temp = arr[min];
	            arr[min] = arr[idx];
	            arr[idx] = temp;
	        }
	    }
	    
	    
	    for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
