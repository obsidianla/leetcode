public int titleToNumber(String s) {
        int len = s.length();
        int num = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            // this line is the most important, iterate each loop
            num =  num * 26 + (c - 'A' + 1);
        }
        return num;
    }
