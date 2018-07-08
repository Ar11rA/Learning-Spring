package Examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysExamples {
    public List<Integer> multiplyEachByTwo(List<Integer> arr) {
        Stream<Integer> streamArr = arr.stream();
        List<Integer> doubledArr = streamArr
                .map(item -> item * 2)
                .collect(Collectors.toList());
        return doubledArr;
    }

    public List<Integer> filterOdd(List<Integer> arr) {
        Stream<Integer> streamArr = arr.stream();
        List<Integer> filteredArr = streamArr
                .filter(item -> item % 2 == 1)
                .collect(Collectors.toList());
        return filteredArr;
    }

    public int sumAll(List<Integer> arr) {
        Stream<Integer> streamArr = arr.stream();
        int sum = streamArr.reduce(0, (acc, item) -> acc + item);
        return sum;
    }

}
