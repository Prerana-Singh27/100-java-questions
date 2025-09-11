//Collection class to count freq of elementin ArrarList

package Collection;


import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class challenge3 {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,4,6,6,8,9,6);
         System.out.println(Collections.frequency(list,6));
     }
}

