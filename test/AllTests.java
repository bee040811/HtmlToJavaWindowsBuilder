import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *   Test Suite
 * @author	CFWei
 */

@RunWith(Suite.class)
@SuiteClasses({ BubbleSortTest.class, HeapSortTest.class,
		InsertionSortTest.class,MergeSortTest.class })
public class AllTests {
}
