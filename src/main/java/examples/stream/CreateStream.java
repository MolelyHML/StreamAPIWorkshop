package examples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.stream();

        Stream<Integer> intStream = Arrays.stream(new Integer[]{1,2,3,4});

        Stream<String> cities = Stream.of("New-York", "Yaroslavl", "Vologda");

        IntStream ints = IntStream.of(1,2,3,4,5,6,7,8);
    }
}
