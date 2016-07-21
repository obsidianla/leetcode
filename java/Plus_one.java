// Acturally, the idea directly comes from addition, add begins from right

public int[] plusOne(int[] digits) {
        
        int l = digits.length;
        
        int digitSum = 1 + digits[l - 1];
        digits[l-1] = digitSum % 10;
        int plus = digitSum/10;
        
        for(int i = l -2; i>=0;i--) {
            digitSum = plus + digits[i];
            digits[i] = digitSum % 10;
            plus = digitSum/10;
        }
        // because in java, the size of array can not be changed, we need to create a new array
        if(plus == 1) {
            int[] result = new int[l+1];
            System.arraycopy(digits, 0 , result, 1, l);
            result[0] = 1;
            return result;
        }
        else return digits;
        
    }
