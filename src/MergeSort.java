import java.util.Comparator;

/**
 *  Bubble sort algorithm implementation.
 *  This implementation has side effect on array.
 * 
 * @author	bee
 */

public class MergeSort implements SortAlgorithm{

	/**
	 * @param args
	 */
	
	/**
	 * @param	array	array to be sorted, may be modified after call.
	 * @param	comparator	decides the order in array.
	 * @return	reference to {@link array}
	 */
	public <T> T[] sort(T[] array, Comparator<T> comparator) {
		int len = array.length;
		mergeSort(array, 0, len-1, comparator);
		return array;
	}
	private <T> T[] mergeSort(T[] array, int start, int end, Comparator<T> comparator) {
		/**
		 * 
		 * Inner mergeSort  
		 * 
		 */
		if( start < end ){
			int mid = ( start + end ) / 2;
			mergeSort(array, start, mid, comparator);
			mergeSort(array, mid+1, end, comparator);
			merge(array, start, mid, end, comparator);
		}
		return array;
	}
	@SuppressWarnings("unchecked")
	private <T> T[] merge(T[] array, int start, int mid, int end, Comparator<T> comparator) {
		/**
		 * 	merge: merge two sorted part into one
		 */
		//merge the two parts
		Object[] temp = new Object[array.length];
		for(int i = start ; i <= end; i++){
			temp[i] = array[i];
		}
		int i = start;
		int j = mid + 1;
		int k = start;
		//selects the smaller element from the two parts
		//and fill the array accordingly
		while(i <= mid && j <= end){
			if( comparator.compare( (T)temp[i] , (T)temp[j]) > 0 ){
				array[k] = (T)temp[j];
				j = j + 1;
			}
			else{
				array[k] = (T)temp[i];
				i = i + 1;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
	    while (i <= mid) {
	    	array[k] = (T)temp[i];
	    	k++;
	    	i++;
	    }

		return array;
		
	}
}
