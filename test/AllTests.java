import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ BubbleSortTest.class, HeapSortTest.class,
		InsertionSortTest.class })
public class AllTests {

}
