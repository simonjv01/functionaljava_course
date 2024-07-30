package lambdas;

import java.util.Comparator;

public class ComparableLambdaExample {

    public static void main(String[] args) {

        /**
         * prior to java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

    }
}
