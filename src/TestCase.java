import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;


public class TestCase{
	private BubbleSort bubble ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		bubble=new BubbleSort();
	}

	@After
	public void tearDown() throws Exception {
		bubble=null;
	}
	
	@Test
	public void test() {
		Integer[] expect={1,2,3,4};
		Integer[] testcase = {4,2,1,3};
		
		bubble.sort(testcase,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
		
		assertArrayEquals(expect, testcase);
	}

}
