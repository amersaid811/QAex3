package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass4 {

    @Test
    public void FullBranchCoverageWithoutExp1() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(0,5);
        assertEquals(0, result, 0.0);
    }
    
  
    
	@Test
    public void FullBranchCoverageWithoutExp2() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(5,5);

        assertEquals(1, result, 0.0);
    }
	
	@Test
    public void FullBranchCoverageWithoutExp3() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(-1,10);
        assertEquals(0, result, 0.0);
    }
    @Test
    public void FullBranchCoverageWithoutExp4() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(4,2);
        assertEquals(2, result, 0.0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void FullBranchCoverageWithoutExp5() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(0,0);
        assertEquals(0, result, 0.0);
    }
    @Test
    public void FullBranchCoverageWithoutExp6() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(-1,-1);
        assertEquals(1, result, 0.0);
        
    }
    @Test(expected = ArithmeticException.class)
    public void FullBranchCoverageWithoutExp7() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(2,0);
        assertEquals(0, result, 0.0);
}
	@Test
    public void FullBranchCoverageWithoutExp8() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(10,-1);
        assertEquals(0, result, 0.0);
    }
}