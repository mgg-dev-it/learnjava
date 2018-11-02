package mggdevit.learnjava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import mggdevit.learnjava.SampleData;

/**
 *
 * @author mgg-dev-it
 *
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
 *
 */
public abstract class LearnStream {

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
        System.out.println("Obtaining streams");
        System.out.println("-----------------");
        dumpStringStream("Empty stream", Stream.empty());
        //String[] sampleData = SampleData.createFruitArray();
        String[] sampleData = SampleData.createRandomOrderedFruitArray();
        System.out.println("Array of random ordered fruits as sample data: " + Arrays.toString(sampleData));
        List<String> stringList = Arrays.asList(sampleData);
        System.out.println("List<String> made from sample data array with 'Arrays.asList(T... a)': " + stringList.toString());

        dumpStringStream("Stream created from array with 'Stream.of(T... values)'", Stream.of(sampleData));
        dumpStringStream("Stream created from array with 'Arrays.stream(T[] array)'", Arrays.stream(sampleData));
        dumpStringStream("Stream created from List<String> with 'Collection.stream()'", stringList.stream());

        System.out.println("");
        System.out.println("Stream info");
        System.out.println("-----------");
        System.out.println("Stream element count: " + Stream.of(sampleData).count());
        System.out.println("Stream any match 'anyMatch(s -> s.contains(\"a\"))': " + Stream.of(sampleData).anyMatch(s -> s.contains("a")));
        System.out.println("Stream all match: 'allMatch(s -> s.contains(\"a\"))': " + Stream.of(sampleData).allMatch(s -> s.contains("a")));
        System.out.println("Stream none match: 'noneMatch(s -> s.contains(\"a\"))': " + Stream.of(sampleData).noneMatch(s -> s.contains("a")));

        System.out.println("");
        System.out.println("Stream to stream");
        System.out.println("----------------");
        dumpStringStream("Five elements of the stream", Stream.of(sampleData).limit(5));

        System.out.println("");
        System.out.println("Optionals");
        System.out.println("---------");
        dumpStringOptional("Any element of the stream ", Stream.of(sampleData).findAny());
        dumpStringOptional("Minimum element of the stream ", Stream.of(sampleData).min(String::compareTo));
        dumpStringOptional("Maximum element of the stream ", Stream.of(sampleData).max(String::compareTo));

        System.out.println("");
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
