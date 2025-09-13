//crea
package seeEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("India", "NewDelhi");
        countryMap.put("china", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("SriLanka", "Columbo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE COUNTRY NAME: ");
        String country = input.next();
        if (countryMap.containsKey(country)) {
            System.out.printf("country of %s is %s" , country,countryMap.get(country));
        }else {
            System.out.println("sorry");
        }

    }
}

