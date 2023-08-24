package examples.stream;

import com.sprokopiev.generators.person.generator.PersonGenerator;
import com.sprokopiev.generators.person.model.Person;

import java.util.List;
import java.util.stream.Stream;

public class APractice {
    public static void main(String[] args) {
        List<Person> list = PersonGenerator.generatePersonsArrayList(20);

        //filter и forEach
        list.stream().filter(p -> p.getAge() > 20).forEach(System.out::print);

        //map - для получения из одного типа другого
        list.stream().map(Person::getAge).filter(age -> age > 43).forEach(System.out::print);

        //flatMap - для получения из одного типа неколько других
        list.stream().flatMap(p -> Stream.of(
                p.getFirstName() + " возраст:" + p.getAge(),
                p.getProfession() + " возраст:" + p.getAge()
        )).forEach(System.out::println);


    }
}
