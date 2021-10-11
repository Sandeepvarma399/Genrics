package org.blz.genrics;


public class Maximum < E extends Comparable> {
    E value1;
    E value2;
    E value3;

    Maximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }



//    public static void main(String[] args) {
//        Integer a = 30, b = 10, c = 20;
//        Float d = 40f, e = 10f, f = 30f;
//        String s1 = "apple", s2 = "peach", s3 = "banana";
//        getMaximum(a, b, c);
//        getMaximum(d, e, f);
//        getMaximum(s1, s2, s3);
//
//    }

    public E getMaximum() {
        E result = getMaximum(value1, value2, value3);
        return result;
    }

    public static <E extends Comparable> E getMaximum(E a, E b, E c) {
        E max = b;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            max = a;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }

        System.out.println(max);
        return max;

    }
}


//   public static Float getMaximum(Float a, Float b, Float c) {
//        Float max = b;
//       if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
//            max = a;
//        } else if (c.compareTo(max) > 0) {
//            max = c;
//        }
//       System.out.println(max);
//        return max;
//  }
//
//    public static String getMaximum( String a, String b, String c) {
//        String max = b;
//        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
//            max = a;
//        } else if (c.compareTo(max) > 0) {
//            max = c;
//        }
//
//        System.out.println(max);
//        return max;
//    }
//
//}
//
//
//
//
