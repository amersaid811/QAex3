package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass2B {

    /***Test Set for 100% Branch Coverage without Error Exposure***/
    
    @Test
    public void FullBranchCoverageWithoutExp1() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod2(2,20);
        assertEquals(10, result, 0.0);
    }
    
    
	@Test
    public void FullBranchCoverageWithoutExp2() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod2(8,5);

        assertEquals(40, result, 0.0);
    }
}
