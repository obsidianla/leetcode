public class Solution {
    public int romanToInt(String s) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item == 'I')
                l.add(1);
            if (item == 'V')
                l.add(5);
            if (item == 'X')
                l.add(10);
            if (item == 'L')
                l.add(50);
            if (item == 'C')
                l.add(100);
            if (item == 'D')
                l.add(500);
            if (item == 'M')
                l.add(1000);
        }
            
        int length = l.size();
        if(length == 1)
            return l.get(0);
        int Sum = 0;
        for (int j = 0; j < length; j++) {
            if(j < length - 1 && l.get(j) < l.get(j+1)){
                Sum -= l.get(j);
            }
            else
                Sum += l.get(j);
        }
        return Sum;
    }
}
