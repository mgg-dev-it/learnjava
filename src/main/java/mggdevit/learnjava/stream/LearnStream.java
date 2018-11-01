package mggdevit.learnjava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import mggdevit.learnjava.SampleData;

/**
 *
 * @author mgg-dev-it
 */
public abstract class LearnStream {

//    public static void ppp(String s) {
//        System.out.print(s + ", ");
//    }
    private static void dumpStringStream(Stream<String> stream) {
        dumpStringStream(null, stream);
    }

    private static void dumpStringStream(String sHead, Stream<String> stream) {
        String[] stringArray = stream.toArray(String[]::new);
        //System.out.println("stream dump: " + Arrays.toString(stringArray));
        System.out.println((sHead == null ? "" : sHead + ": ") + Arrays.toString(stringArray));
    }

    private static void dumpStringOptional(Optional<String> optional) {
        dumpStringOptional(null, optional);
    }

    private static void dumpStringOptional(String sHead, Optional<String> optional) {
        if (optional.isPresent()) {
            System.out.println((sHead == null ? "" : sHead + ": ") + optional.get());
        } else {
            System.out.println((sHead == null ? "" : sHead + ": ") + "is not present");
        }
    }

    public static void learn() {
        Stream<String> streamEmpty = Stream.empty();
//        System.out.println("Empty stream");
        dumpStringStream("Empty stream", Stream.empty());

        //String[] sampleData = SampleData.createFruitArray();
        String[] sampleData = SampleData.createRandomOrderedFruitArray();
        //System.out.println(sampleData);
        //System.out.println(Arrays.toString(sampleData));
        //System.out.println(Stream.of(SampleData.createFruitArray()).reduce("", (s, c) -> s + c + ", "));
        //System.out.println("---");
        //System.out.println(Stream.of("apple", "orange", "pear").reduce("", (s, c) -> s + c + ", "));
        //System.out.println("---");

        dumpStringStream("Random ordered fruit stream", Stream.of(sampleData));
        System.out.println("Stream element count: " + Stream.of(sampleData).count());
        dumpStringStream("Five elements of the stream", Stream.of(sampleData).limit(5));
        dumpStringOptional("Any element of the stream ", Stream.of(sampleData).findAny());
        dumpStringOptional("Minimum element of the stream ", Stream.of(sampleData).min(String::compareTo));
        dumpStringOptional("Maximum element of the stream ", Stream.of(sampleData).max(String::compareTo));

        System.out.println("---");
        dumpStringStream("Ordered stream", Stream.of(sampleData).sorted((String s1, String s2) -> (s1.compareTo(s2))));
        dumpStringOptional("First element of the ordered stream ", Stream.of(sampleData).sorted((String s1, String s2) -> (s1.compareTo(s2))).findFirst());
        dumpStringStream("Five elements of the ordered stream", Stream.of(sampleData).sorted((String s1, String s2) -> (s1.compareTo(s2))).limit(5));

//        Stream<String> stream = Stream.of(sampleData);
//        Stream<String> streamSorted = stream.sorted((String s1, String s2) -> (s2.compareTo(s1)));
//        Optional<String> optionalFound = streamSorted.findFirst();
//        if (optionalFound.isPresent()) {
//            System.out.println(optionalFound);
//        }
    }
}
