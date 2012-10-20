import java.util.Comparator;

/**
 *  Bubble sort algorithm implementation.
 *  This implementation has side effect on array.
 * 
 * @author	Southernbear
 */

public class BubbleSort implements SortAlgorithm{
	
	/**
	 * @param	array	array to be sorted, may be modified after call.
	 * @param	comparator	decides the order in array.
	 * @return	reference to {@link array}
	 */
	public <T> T[] sort(T[] array, Comparator<T> comparator) {
		int len = array.length;
		for(int i = len - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(comparator.compare(array[j], array[j+1]) > 0){
					T swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		return array;
	}
}
