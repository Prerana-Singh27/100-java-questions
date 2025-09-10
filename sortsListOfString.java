
package Collection;

import java.util.*;

//class comparator
class challenge2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(" lion "," bear ", " ant ",  " zebra ");
        System.out.println(list);
        sortDescending(list);
        System.out.println(list);
    }
    public static void sortDescending(List<String> stringlist){
        Collections.sort(stringlist, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
            });
    }
}

