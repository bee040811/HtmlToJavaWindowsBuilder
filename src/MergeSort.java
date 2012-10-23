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
		/*
		int len = array.length;
		array = mergeSort(array, 0, len-1, comparator);
		
		*/
		return array;
	}
	private <T> T[] mergeSort(T[] array, int start, int end, Comparator<T> comparator) {
		// TODO Auto-generated method stub
		if( start < end ){
			int mid = ( start + end ) / 2;
			array = mergeSort(array, start, mid, comparator);
			array = mergeSort(array, mid, end, comparator);
			array = merge(array, start, mid, end, comparator);
		}
		return array;
		
	}
	private <T> T[] merge(T[] array, int start, int mid, int end, Comparator<T> comparator) {
		// TODO Auto-generated method stub
		//merge the two parts
		T[] temp = null;
		for(int i = start ; i <= end; i++){
			temp[i] = array[i];
		}
		int i = start;
		int j = mid + 1;
		int k = start;
		//selects the smaller element from the two parts
		//and fill the array accordingly
		while(i <= mid && j <= end){
			if( comparator.compare(temp[j], temp[i]) > 0 ){
				array[k] = temp[i];
				i = i + 1;
			}
			else{
				array[k] = temp[j];
				j = j + 1;
			}
			k++;
		}
		return array;
		
	}
}
