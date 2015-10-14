package pap.lorinc.algos.helpers;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.generate;

public class Strings {
    public static String repeat(String repetition, int count) {
        return generate(() -> repetition)
                       .limit(count + 1)
                       .collect(joining());
    }
}
