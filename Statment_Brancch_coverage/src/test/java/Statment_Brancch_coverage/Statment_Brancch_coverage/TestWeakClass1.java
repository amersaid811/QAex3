package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakClass1 {
 

/***Test Set for Less than 100% Statement Coverage with Error Exposure***/

    @Test(expected = ArithmeticException.class)
    public void LessCoverageWithExp() {
        WeakClass weakClass = new WeakClass();
        double result = weakClass.weakMethod1(10, 0);
        
    }
    

  
}
