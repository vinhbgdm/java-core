import java.util.function.*;

public class Functional_Interfaces {
    @FunctionalInterface
    public interface MyFunctionalInterface {
        void doSomething();

        static void doSomethingElse() {
            System.out.println("Do something else");
        }

        default void printMessage() {
            System.out.println("Printing message");
        }
    }

    @FunctionalInterface
    public interface Calculator {
        void reckon(int a, int b);
    }

    public static void main(String[] args) {

        // Predicate: đánh giá một điều kiện trên đối tượng kiểu T và trả về giá trị boolean
        System.out.println("-------[Predicate]-------");
        Predicate<String> isLonger = str -> str.length() > 8;
        System.out.println(isLonger.test("abcdd"));

        // Function<T, R>: ánh xạ mội đối tượng kiểu T sang kiểu R
        System.out.println("\n-------[Function]-------");
        Function<String, Integer> stringInteger = str -> str.length();
        System.out.println(stringInteger.apply("abc"));

        // Consumer: thực hiện hành động trên đối tượng kiểu T mà không trả về kết quả
        System.out.println("-------[Consumer]-------");
        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("vinhbgdm");

        // Supplier: Cung cấp một giá trị kiểu T mà không cần tham số đầu vào
        System.out.println("-------[Supplier]-------");
        Supplier<String> stringSupplier = () -> "Vinh đây rồi";
        System.out.println(stringSupplier.get());

        // BiFunction<T, U, R>: nhận hai tham số kiểu T và U, trả về giá trị của R
        System.out.println("-------[BiFunction]-------");
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(1, 2));

        // Lambda
        System.out.println("-------[Lambda]-------");
        MyFunctionalInterface newWay = () -> System.out.println("Cách viết mới");
        newWay.doSomething();

        // Method reference
        System.out.println("-------[Method reference]-------");
        Consumer<String> printMethodReference = System.out::println;
        printMethodReference.accept("vinhbgdm2k1");

        MyFunctionalInterface myFunctionalInterface = Functional_Interfaces::printMethodReference;
        myFunctionalInterface.doSomething();

        Calculator calculator = Functional_Interfaces::addition;
        calculator.reckon(3, 4);
    }

    static void printMethodReference() {
        System.out.println("printMethodReference");
    }

    static void addition(int a, int b) {
        System.out.println(a + b);
    }
}
