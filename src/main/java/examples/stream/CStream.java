package examples.stream;

import com.sprokopiev.generators.items.generator.ItemGenerator;
import com.sprokopiev.generators.items.model.Item;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CStream {
    public static void main(String[] args) {

        //takeWhile
        List<Item> items = ItemGenerator.generateItemsLinkedList(35);
        System.out.println(items);
        List<Item> newItems = items.stream().takeWhile(i -> i.getWeight() > 5).toList();
        System.out.println(newItems);

        //dropWhile
        Optional<Item> item2 = items.stream().dropWhile(item -> item.getWeight() > 5).findAny();
        if(item2.isPresent())
            System.out.println(item2.get());
        else
            System.out.println("NONE");

        //concat
        List<Item> concatItems = Stream.concat(items.stream(), newItems.stream()).toList();
        System.out.println(concatItems);

        //distinct
        int[] ar = IntStream.of(1,2,2,3,3,4,4,4,4,7,5,5,0,0,0).distinct().toArray();
        System.out.println(Arrays.toString(ar));
    }
}
