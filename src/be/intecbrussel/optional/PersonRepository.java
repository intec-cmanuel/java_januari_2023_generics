package be.intecbrussel.optional;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonRepository {
    private Person[] people = new Person[12];

    {
        people[0] = new Person("Jan");
        people[1] = new Person("Fred");
        people[2] = new Person("Koen");
        people[3] = new Person("Lies");
        people[4] = new Person("Red one");
        people[5] = new Person("Far it");
    }

    public Optional<Person> findPerson(String name) {
        for (Person person : people) {
            if (person == null) {
                continue;
            }

            if (person.name.equals(name)) {
                return Optional.of(person);
            }
        }

        return Optional.empty();
    }
}
