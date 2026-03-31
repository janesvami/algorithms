package fizzbuzz;

import java.util.Arrays;

public class FizzBuzzWithStreamApi implements FizzBuzzPrinter {
    @Override
    public void fizzBuzzPrint() {
        final int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }

        Arrays.stream(arr)
                .mapToObj(x -> x % 15 == 0 ? "FizzBuzz" : x % 3 == 0 ? "Fizz" : x % 5 == 0 ? "Buzz" : x)
                .forEach(System.out::println);
    }
}