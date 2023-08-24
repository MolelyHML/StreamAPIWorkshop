package examples.stream;

import com.sprokopiev.generators.person.generator.PersonGenerator;
import com.sprokopiev.generators.person.model.Person;

import java.util.List;
import java.util.Optional;

public class DStream {
    public static void main(String[] args) {
        List<Person> people = PersonGenerator.generatePersonsArrayList(100);

        //count
        long peopleOlder35 = people.stream().filter(p -> p.getAge() > 25).count();
        System.out.println(peopleOlder35);

        //findFirst
        Optional<Person> person = people.stream().filter(p -> p.getAge() == 45).findFirst();
        if(person.isPresent())
            System.out.println(person.get());
        else
            System.out.println("NONE");

        //findAny
        Optional<Person> person2 = people.stream().findAny();
        System.out.println(person2.get());

        //allMatch noneMatch anyMatch
        boolean a = people.stream().allMatch(p -> p.getAge() >= 0);
        boolean b = people.stream().noneMatch(p -> p.getAge() > 25);
        boolean c = people.stream().anyMatch(p -> p.getAge() == 33);
        System.out.println(a + " " + b + " " + c );

        //min max
        Optional<Integer> min = people.stream().map(Person::getAge).min(Integer::compareTo);
        System.out.println(min.get());

        Optional<Integer> max = people.stream().map(Person::getAge).max(Integer::compareTo);
        System.out.println(max.get());
    }
}
