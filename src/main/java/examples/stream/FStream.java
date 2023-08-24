package examples.stream;

import com.sprokopiev.generators.items.generator.ItemGenerator;
import com.sprokopiev.generators.items.model.Item;
import com.sprokopiev.generators.person.generator.PersonGenerator;
import com.sprokopiev.generators.person.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FStream {
    public static void main(String[] args) {
        //collect
        List<Integer> ages = PersonGenerator.generatePersonsArrayList(20).stream().map(Person::getAge).collect(Collectors.toList());
        System.out.println(ages);

//        Map<String, Integer> agesMap = PersonGenerator.generatePersonsArrayList(20).stream()
//                .collect(Collectors.toMap(Person::getFirstName, Person::getAge));
//        System.out.println(agesMap);


        ArrayList<Person> people = PersonGenerator.generatePersonsArrayList(70).stream().filter(p -> p.getAge() > 15)
                .collect(() -> new ArrayList<Person>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2));
        System.out.println(people);

        //группировка

        Map<Integer, List<Person>> personMap = PersonGenerator.generatePersonsArrayList(100).stream().collect(Collectors.groupingBy(Person::getAge));
    }
}
