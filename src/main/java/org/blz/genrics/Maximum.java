package org.blz.genrics;


public class Maximum {
    public static void main(String[] args) {
        Integer a = 30, b = 10, c = 20;
        getMaximum(a, b, c);
    }

    public static Integer getMaximum(Integer a, Integer b, Integer c) {
        Integer max = b;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            max = a;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
//        System.out.println(max);
        return max;
    }


}




