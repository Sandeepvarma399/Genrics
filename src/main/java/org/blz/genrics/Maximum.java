package org.blz.genrics;


public class Maximum {

    public static void main(String[] args) {
        Integer a = 30, b = 10, c = 20;
        Float d = 40f, e = 10f, f = 30f;
        getMaximum(a, b, c);
        getMaximum(d, e, f);
    }

    public static Integer getMaximum(Integer a, Integer b, Integer c) {
        Integer max = b;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            max = a;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println(max);
        return max;
    }

       public static Float getMaximum(Float a, Float b, Float c) {
        Float max = b;
       if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            max = a;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
       System.out.println(max);
        return max;
  }
}