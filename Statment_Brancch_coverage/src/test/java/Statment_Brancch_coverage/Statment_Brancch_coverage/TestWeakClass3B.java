package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass3B {

	@Test
    public void FullBranchCoverageWithoutExp1() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod3(0,15);
        assertEquals(15.0, result, 0.0);

        
    }
    public void FullBranchCoverageWithoutExp2() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod3(2,5);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);

        
    }
	@Test
    public void FullBranchCoverageWithoutExp3() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod3(1,10);
        assertEquals(0.0, result, 0.0);
    
}
    @Test(expected = ArithmeticException.class)
    public void FullBranchCoverageWithoutExp4() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod3(0,5);
        assertEquals(0.0, result, 0.0);
    
}
	@Test
    public void FullBranchCoverageWithoutExp5() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod3(5,5);
        assertEquals(1, result, 0.0);
    
}
 
        
    }
    
