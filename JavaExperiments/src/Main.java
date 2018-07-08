import Examples.StringsExamples;
import POJO.Person;
import Examples.ArraysExamples;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        POJOExample();
        ArraysExample();
        StringExample();
    }

    public static void POJOExample() {
        Person person = new Person();
        person.setName("abc");
        person.setEmail("abc@mail.com");
        System.out.println(person.getName());
    }

    public static void ArraysExample() {
        ArraysExamples arr = new ArraysExamples();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddNumbers = arr.filterOdd(numbers);
        List<Integer> doubledNumbers = arr.multiplyEachByTwo(oddNumbers);
        int sum = arr.sumAll(doubledNumbers);
        System.out.println(oddNumbers);
        System.out.println(doubledNumbers.toString());
        System.out.println(sum);
    }

    public static void StringExample() {
        StringsExamples str = new StringsExamples();
        str.parse("username:password");
    }
}
