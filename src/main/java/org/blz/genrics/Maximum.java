package org.blz.genrics;


public class Maximum {
    public static void main(String[] args) {
       Integer a=10,b=30,c=20;
        getMaximum(a,b,c);
    }
    public static Integer getMaximum(Integer a,Integer b,Integer c){
        Integer max = a;
        if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            max = b;
        }
        else if (c.compareTo(max)>0) {
            max = c;
        }
        return max;
        System.out.println(max);
    }
}

