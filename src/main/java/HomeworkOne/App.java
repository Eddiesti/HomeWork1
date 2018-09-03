package HomeworkOne;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class App {
    public static void main(String[] args) {
        Multiset<String> citys = HashMultiset.create();
        citys.add("Moscow");
        citys.add("Minsk");
        citys.add("Kiev");
        for (String city : citys) {
            System.out.println(city);
        }
    }
}
