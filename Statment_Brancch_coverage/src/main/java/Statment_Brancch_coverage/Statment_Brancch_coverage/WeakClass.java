package Statment_Brancch_coverage.Statment_Brancch_coverage;


public class WeakClass {
	
    /*##QUESTION.1######################################################################################*/
   public static double weakMethod1(int a, int b) {
        double result;
        
        if (b == 0 || a>5) {

        	result = a/b;

        } else {
        	result = (double)a+b;
        }
        
        return result;
    }
    
  
    /*##QUESTION.2######################################################################################*/
  public static double weakMethod2(int a, int b) {
        double result = 0.0;
        
        if (a < 5) {
        	
        	result =  b / a;
        }
        if (b < 10) {
            result = b * a;
        }
        
        return result;
    }
    
    
    /*##QUESTION.3######################################################################################*/
    public static double weakMethod3(int a, int b) {
        double result = 0.0;

        if (a<1 && b > 10) {
        	result = b+(2*a);
        } 
        if (b==5) {
            result = b / a;
        }

        return result;
    }
 
    /*##QUESTION.4######################################################################################*/
   public static double weakMethod4(int a, int b) {
        double result = 0.0;

        if (a == 0 || b == 0) {
        	result = a/b;
        }
        if (a > 0 && b > 0) {
            result = a / b;
        }
        if (a < 0 && b < 0) {
            result = a * b;
        }

        return result;
    }

}




