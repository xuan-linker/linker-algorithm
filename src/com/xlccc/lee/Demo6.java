package com.xlccc.lee;

public class Demo6 {
    /**
     * Z: 3-4 4-6 5-8  => (numRows-1)*2 两笔划合计 ； 3-2 4-3 5-4 两笔划行数 => (numRows -1)
     * <p>
     * char[][] for s
     * 1-0-0 2-1-0 3-2-0 4-1-1 || 5-0-2 6-1-2 7-2-2 8-1-3 9-0-4
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        int strLength = s.length();
        int towCount = ((numRows - 1) * 2);
        char[][] tempChars = new char[numRows][strLength / ((numRows - 1) * 2) + (numRows - 1) * 2];
        for (int i = 0; i < strLength; i++) {
            int first = -1;
            if (i % towCount > numRows) {
                first = numRows * 2 - i % towCount;
            } else {
                first = i % towCount;
            }
            int second = -1;
            if (i % towCount > numRows) {
                second = i / towCount + (i % towCount - numRows) + 1;
            } else {
                second = i / towCount ;
            }
            tempChars[first][second] = s.charAt(i);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tempChars.length; i++) {
            for (int j = 0; j < tempChars[i].length; j++) {
                if (tempChars[i][j] != 0)
                    sb.append(tempChars[i][j]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Demo6 d = new Demo6();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String convert = d.convert(s, numRows);
        System.out.println(convert);
    }
}
