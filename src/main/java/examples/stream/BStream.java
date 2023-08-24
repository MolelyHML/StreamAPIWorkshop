package examples.stream;

import com.sprokopiev.generators.person.generator.PersonGenerator;
import com.sprokopiev.generators.person.model.Person;

import java.util.Comparator;
import java.util.List;

public class BStream {

   static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person person, Person t1) {
            if(person.getAge() > t1.getAge())
                return 1;
            if(person.getAge() == t1.getAge())
                return 0;
            else
                return -1;
        }
    }
    public static void main(String[] args) {
        List<Person> people = PersonGenerator.generatePersonsArrayList(45);
        System.out.println(people);

        //sorted
        List<Person> sorted = people.stream().sorted(new PersonComparator()).toList();
        System.out.println(sorted);
    }
}
