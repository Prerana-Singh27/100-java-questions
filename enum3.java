// ENHANCE THE DAY ENUM BY WEEKDAY OR WEEKEND 

package seeEnum;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing the days of the week:");
        for (Day day : Day.values()) {
          System.out.printf("%s : %s\n" , day,day.getType());        }
   }
}

