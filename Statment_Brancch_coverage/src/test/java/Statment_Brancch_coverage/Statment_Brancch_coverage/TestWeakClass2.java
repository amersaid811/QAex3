package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass2 {

	/***Test Set for Less than 100% Branch Coverage with Error Exposure***/
    
   @Test(expected = ArithmeticException.class)
    public void LessBranchCoverageWithExp() {
        WeakClass.weakMethod2(0,20);

    }
    
    
}
