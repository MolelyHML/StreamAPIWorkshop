package examples.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class EStream {
    public static void main(String[] args) {
        //reduce
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7);
        Optional<Integer> result = integerStream.reduce((x,y) -> x * y);
        System.out.println(result.get());

        Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7);
        int result2 = integerStream1.reduce(-1, (x,y) -> x * y);
        System.out.println(result2);
    }
}
