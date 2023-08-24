package examples.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UseOptional {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(i);

        Optional<Integer> optional = list.stream().filter(n -> n > 5).findAny();
        optional.ifPresent(System.out::println);
    }
}
