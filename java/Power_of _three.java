
// iterative
public boolean isPowerOfThree(int n) {
        if ( n == 0 ) return false;
        while(n != 1) {
            if ( n%3 != 0 ) {
                return false;
            }
                
            else {
                n = n / 3;
            }
                
        }
        return true;
    }
// math

public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        else return n == Math.pow(3, Math.round(Math.log(n)/Math.log(3)));
    }
