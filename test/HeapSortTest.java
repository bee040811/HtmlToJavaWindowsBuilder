import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * UnitTest For Heap Sort  
 * 
 * @author	CFWei
 */

public class HeapSortTest {
	private HeapSort heapsort;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		heapsort=new HeapSort();
	}

	@After
	public void tearDown() throws Exception {
		heapsort=null;
	}

	@Test
	public void test() {
		Integer[] expect={1,2,3,4};
		Integer[] testcase = {4,2,1,3};
		
		heapsort.sort(testcase,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
		
		assertArrayEquals(expect, testcase);
	
	}

}
