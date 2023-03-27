package be.intecbrussel;

import be.intecbrussel.generic.Container;
import be.intecbrussel.notverygeneric.DoubleContainer;
import be.intecbrussel.notverygeneric.StringContainer;

import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class GenericApp {
    public static void main(String[] args) {
        Container<String> error = new Container<>(
                "CORS",
                "The Same Origin Policy disallows reading the remote resource"
        );

        Container<Double> amountOfDaysSpentOnThatError = new Container<>("CORS", 3.0);

        String myError = error.toString();
        System.out.println(myError);

        String daysSpent = amountOfDaysSpentOnThatError.toString();
        System.out.println(daysSpent);

        double days = amountOfDaysSpentOnThatError.getData();
        System.out.println(days);

        Predicate<Integer> pred = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        Predicate<String> pred2 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        Stream.of("1","2","3","65","5")
                .filter(e -> e.equals(e))
                .forEach(System.out::println);
    }
}
