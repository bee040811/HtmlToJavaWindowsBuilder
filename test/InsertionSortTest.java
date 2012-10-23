import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class InsertionSortTest {
	private InsertionSort insertionsort;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		insertionsort=new InsertionSort();
		
	}

	@After
	public void tearDown() throws Exception {
		insertionsort=null;
	}

	@Test
	public void test() {
		Integer[] expect={1,2,3,4};
		Integer[] testcase = {4,2,1,3};
		insertionsort.sort(testcase,new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0-arg1;
			}});
		assertArrayEquals(expect, testcase);
	}

}
