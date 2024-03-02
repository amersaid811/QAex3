package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass3B {

	@Test
    public void FullBranchCoverageWithoutExp2() {

    	WeakClass obj = new WeakClass();
        double result = obj.weakMethod3(0,12);

        
    }
}
