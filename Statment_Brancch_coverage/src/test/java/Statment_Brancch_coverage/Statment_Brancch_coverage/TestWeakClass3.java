package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestWeakClass3 {
    /***Test Set for 100% Statement Coverage & Less Branch Coverage without Error Exposure***/
    
    @Test
    public void FullStatementCovLessBranchCov() {
        WeakClass obj = new WeakClass();
        double result = obj.weakMethod3(0,20);
        assertEquals(20, result, 0.0);
    }
    
    


}