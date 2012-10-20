import java.util.Comparator;

/**
 * interface of sort algorithm
 * 
 * @author	Southernbear
 */

public interface SortAlgorithm {
	/**
	 * @param	array		array to be sorted
	 * @param	comparator	decide the order of array
	 * @return 	a sorted array which may be origin or newly created 
	 */
	public <T> T[] sort(T[] array, Comparator<T> comparator);
}