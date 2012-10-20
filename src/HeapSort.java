import java.util.Comparator;

/**
 *  Heap sort algorithm implementation and the algorithm is unstable.
 *  This implementation has side effect on array.
 * 
 * @author	Southernbear
 */

public class HeapSort implements SortAlgorithm{
	
	/**
	 * @param	array	array to be sorted, may be modified after call.
	 * @param	comparator	decides the order in array.
	 * @return	reference to {@link array}
	 */
	public <T> T[] sort(T[] array, Comparator<T> comparator) {
		int len = array.length;
	
		/* Build maximum heap */
		for(int i = len/2; i >= 0; i--)
			maxHeapify(array, len, comparator, i);

		for(int i = len-1; i > 0; i--){
			T temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			len--;
			maxHeapify(array, len, comparator, 0);
		}
		
		return array;
	}
	
	private <T> void maxHeapify(T[] array, int len, Comparator<T> comparator, int parent){
		int leftChild = parent * 2;
		int rightChild = parent * 2 + 1;
		int max = parent;
		
		/* Find maximum among parent, left child and right child */
		if(leftChild < len && comparator.compare(array[leftChild], array[max]) > 0){
			max = leftChild;
		}
		if(rightChild < len && comparator.compare(array[rightChild], array[max]) > 0){
			max = rightChild;
		}
		
		/* Swap data in parent and max and then propagate */
		if(parent != max){
			T temp = array[parent];
			array[parent] = array[max];
			array[max] = temp;
			
			maxHeapify(array, len, comparator, max);
		}
	}
}
