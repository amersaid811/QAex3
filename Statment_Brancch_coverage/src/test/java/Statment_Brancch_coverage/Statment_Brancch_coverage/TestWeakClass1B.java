package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass1B {

	 /***Test Set for 100% Statement Coverage without Error Exposure***/

  @Test
    public void FullCoverageWithoutExp1() {
        WeakClass weakClass = new WeakClass();
        double result = weakClass.weakMethod1(8, 2);
        assertEquals(4.0, result, 0.0);
    }
    
    @Test
    public void FullCoverageWithoutExp2() {
        WeakClass weakClass = new WeakClass();
        double result = weakClass.weakMethod1(2, 2);
        assertEquals(4.0, result, 0.0);
    }


}
