import java.util.Comparator;

public class InsertionSort implements SortAlgorithm{
	
	/**
	 * @param	array	array to be sorted, may be modified after call.
	 * @param	comparator	decides the order in array.
	 * @return	reference to {@link array}
	 */
	public <T> T[] sort(T[] array, Comparator<T> comparator) {
		int len = array.length;
		
		for(int i=1;i<len;i++){
			T key=array[i];
			int j=i-1;
			while(j>=0 && comparator.compare(array[j], key) > 0){
				array[j+1] = array[j];
				j--;
			}
			array[j+1]=key;
		}
		return array;
	}
}
