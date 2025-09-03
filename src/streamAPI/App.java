package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
//        MockUp.orderList().stream().filter(order -> order.getProductType().equals("Mobile")).forEach(System.out::println);
//
//        List<String> vendors = MockUp.orderList().stream().map(Order::getProductType).distinct().toList();
//        System.out.println(vendors);

        allMatch();
        anyMatch();
    }

    private static void allMatch() {
        // get all product by type = Mobile
        List<Order> mobile = MockUp.orderList().stream()
                .filter(order -> Objects.equals(order.getProductType(), "Mobile"))
                .collect(Collectors.toList());

        System.out.println("Check Mobile");
        boolean isMobile = mobile.stream()
                .allMatch(order -> Objects.equals(order.getProductType(), "Mobile"));
        if (isMobile) {
            System.out.println("All products are Mobile");
        }
    }

    private static void anyMatch() {
        boolean flag = MockUp.orderList().stream().anyMatch(order -> order.getProductName().equals("MacBook Pro"));
        System.out.println(flag);
    }

    private static void noneMatch() {
        boolean check = MockUp.orderList().stream().noneMatch(order -> order.getPrice() > 800);
        if(check) {
            System.out.println("There is no order with price greater than 800");
        } else {
            System.out.println("All products are Not None");
        }
    }

    private static void streamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Java").add("PHP").add("Python").build();
        stream.forEach(System.out::println);
    }

    private static void collect() {
        System.out.println("Collectors.toList(): All Samsung");
        List<Order> samsung = MockUp.orderList().stream()
                .filter(order -> Objects.equals(order.getVendor(), "Samsung"))
                .collect(Collectors.toList());
        System.out.println(samsung);

        System.out.println("Collectors.toSet(): All Vendor");
        Set<String> vendors = MockUp.orderList().stream().map(Order::getVendor).collect(Collectors.toSet());
        System.out.println(vendors);
    }

    private static void streamConcat() {
        Stream<String> stream1 = Stream.of("A");
        Stream<String> stream2 = Stream.of("B");
        Stream<String> stream3 = Stream.of("C");
        Stream<String> stream4 = Stream.of("D");

        Stream.concat(Stream.concat(Stream.concat(stream1, stream2), stream3), stream3).forEach(System.out::println);
    }

    private static void distinct() {
        List<String> productType = MockUp.orderList().stream().map(Order::getProductType).distinct().collect(Collectors.toList());
        System.out.println(productType);
    }

    private static void findAny() {
        // instance new stream empty
        List<String> productType = MockUp.orderList().stream().map(Order::getProductType).toList();

        Optional<String> check = productType.stream().findAny();

        if (check.isPresent()) {
            productType.forEach(System.out::println);
        } else {
            System.out.println("ProductType not exist");
        }
    }

    private static void findFirst() {
        Optional<Order> first = MockUp.orderList().stream().findFirst();
        first.ifPresent(System.out::println);
    }

    private static void flatMap() {
        List<Order> orders = MockUp.orderList();
        List<String> productName = orders.stream().map(Order::getProductName).toList();
        List<String> productType = orders.stream().map(Order::getProductType).toList();

        List<List<String>> product = new ArrayList<>();
        product.add(productName);
        product.add(productType);

        System.out.println("Distinct all product type");
        product.stream().flatMap(list -> list.stream().distinct()).forEach(System.out::println);
        System.out.println("\nTotal price");
        double total = MockUp.orderList().stream().map(Order::getPrice).flatMapToDouble(DoubleStream::of).sum();
        System.out.println(total);

        System.out.println("Print first character");
        productName.stream().flatMap(s -> Stream.of(s.toUpperCase().charAt(0))).forEach(System.out::println);
    }

    private static void generate() {
        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
        Stream.generate(new Random()::nextDouble).limit(3).forEach(System.out::println);
    }

    private static void common() {
        List<Order> personList = MockUp.orderList();

        // System.out.println("\n-- Sum salary --");
        double totalSalary1 = personList.stream().mapToDouble(Order::getPrice).sum();
        System.out.println("Sum by Lambda : " + totalSalary1);

        Double totalSalary2 = personList.stream().map(Order::getPrice)
                .reduce(0.0d, Double::sum);
        System.out.println("Sum by reduce, Double::sum : " + totalSalary2);

        Double totalSalary3 = personList.stream().map(Order::getPrice)
                .reduce(0.0d, (sum, salary) -> sum + salary);
        System.out.println("Sum by reduce, Lambda : " + totalSalary3);

        Double totalSalary4 = personList.stream()
                .collect(Collectors.summingDouble(Order::getPrice));
        System.out.println("Sum by Collectors.summingDouble : " + totalSalary4);

        System.out.println("\n-- Max salary --");
        System.out.println(personList.stream().mapToDouble(Order::getPrice).max().getAsDouble());

        System.out.println("\n-- Min salary --");
        System.out.println(personList.stream().mapToDouble(Order::getPrice).min().getAsDouble());

        System.out.println("\n-- Average salary --");
        System.out.println(personList.stream().mapToDouble(Order::getPrice).average().getAsDouble());
    }


    private static void sort() {
        MockUp.orderList().stream().map(Order::getProductName).sorted().forEach(System.out::println);
    }

    private static void skip() {
        MockUp.orderList().stream().skip(1).forEach(System.out::println);
    }

    private static void peek() {
        MockUp.orderList().stream().peek(order -> order.setProductName(order.getProductName().toUpperCase())).forEach(System.out::println);
    }

}
