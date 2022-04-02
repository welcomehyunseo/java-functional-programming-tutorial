package basic;

import java.util.ArrayList;
import java.util.List;

import static basic.Basic.Gender.FEMALE;
import static basic.Basic.Gender.MALE;

public class Basic {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        System.out.println("\n\n\nImperative approach\n");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("\n\n\nDeclarative approach\n");
        List<Person> females2 = people
                .stream()
                .filter(person -> FEMALE.equals(person.gender))
                .toList();  // .collect(Collectors.toList());

        females2.forEach(System.out::println);
    }

    record Person(String name, Gender gender) {

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
