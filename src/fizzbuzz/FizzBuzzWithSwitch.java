package fizzbuzz;

public class FizzBuzzWithSwitch implements FizzBuzzPrinter{
    @Override
    public void fizzBuzzPrint() {
        for (int i = 1; i < 100; i++){
            int key = i % 15 == 0 ? 1 : i % 3 == 0 ? 2 : i % 5 == 0 ? 3 : 0;

            switch (key) {
                case 1 -> System.out.println("FizzBuzz");
                case 2 -> System.out.println("Fizz");
                case 3 -> System.out.println("Buzz");
                default -> System.out.println(i);
            }
        }
    }
}
