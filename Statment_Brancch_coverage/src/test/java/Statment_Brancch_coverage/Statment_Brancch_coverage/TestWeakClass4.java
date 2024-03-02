package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass4 {

    @Test
    public void FullBranchCoverageWithoutExp1() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod4(0,20);
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
        double result = obj.weakMethod4(1,-2);

        assertEquals(-2, result, 0.0);
    }
}