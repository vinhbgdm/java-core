### Java 8 (được phát hành vào tháng 3 năm 2014) là một phiên bản quan trọng trong lịch sử phát triển của ngôn ngữ Java, mang lại nhiều tính năng mới và cải tiến, giúp tăng cường hiệu suất, khả năng mở rộng và lập trình dễ dàng hơn. Dưới đây là một tổng quan về các tính năng quan trọng của Java 8.
#### 1. Functional Interfaces
> Functional Interfaces là các interface có duy nhất một phương thức trừu tượng. Trong Java 8, các interface này được tăng cường với các phương thức mặc định (default methods) và phương thức tĩnh (static methods). Các biểu thức Lambda có thể được sử dụng với các interface này.
#### 2. Lambda Expressions
> Biểu thức Lambda là một tính năng quan trọng nhất của Java 8, cho phép viết các hàm ẩn danh (anonymous functions) trong Java. Nó giúp làm cho mã nguồn ngắn gọn, dễ đọc và dễ bảo trì hơn, đặc biệt khi làm việc với các Functional Interface.
#### 3. Method References
> Thay vì sử dụng biểu thức Lambda chúng ta có thể sử dụng tham chiếu phương thức để tham chiếu trực tiếp đến các phương thức.
#### 4. Default Methods
> Java 8 cho phép các phương thức mặc định trong các interface, có nghĩa là các phương thức này có thể được triển khai ngay trong interface mà không bắt buộc các lớp kế thừa phải implements. Điều này giúp mở rộng các interface mà không làm hỏng tính tương thích ngược.
#### 5. Streams API
> Streams API giúp thao tác với tập hợp dữ liệu (Collection) theo cách dễ dàng và hiệu quả hơn, đặc biệt trong việc xử lý tập dữ liệu lớn. Nó hỗ trợ các thao tác như lọc (filter), ánh xạ (map), và giảm (reduce) mà không cần phải viết mã vòng lặp phức tạp.
#### 6. Optional
> Optional là một lớp giúp xử lý các giá trị có thể là null, tránh việc phát sinh lỗi NullPointerException bằng cách cung cấp các phương pháp tiếp cận an toàn hơn với giá trị null.
#### 7. New Date and Time API
> Java 8 giới thiệu gói java.time, giúp quản lý ngày và giờ một cách đơn giản, rõ ràng và mạnh mẽ hơn so với java.util.Date và java.util.Calendar.
```java
public class App {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate sunday = LocalDate.of(2024, Month.OCTOBER, 6);

        System.out.println(today);
        System.out.println(sunday);
    }
}
```
#### 8. Nashorn JavaScript Engine
> Java 8 giới thiệu Nashorn, một công cụ JavaScript được tích hợp vào JVM, cho phép chúng ta nhúng và chạy mã JavaScript trực tiếp từ Java. Tuy nhiên Nashorn đã bị loại bỏ trong Java 15, GraalVM là một sự thay thế hoàn hảo, với hiệu suất cao hơn và hỗ trợ đa ngôn ngữ tốt hơn. GraalVM có thể chạy JavaScript, Ruby, Python, và nhiều ngôn ngữ khác trên JVM.
#### 9. Parallel Array Sorting
> Java 8 cung cấp phương pháp sắp xếp mảng song song, giúp tăng tốc độ sắp xếp các mảng lớn bằng cách chia nhỏ và sắp xếp chúng đồng thời.
```java
public class App {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 5, 7, 1};
        Arrays.parallelSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```
#### 10. Improved Concurrency
> Java 8 giới thiệu các công cụ mới để làm việc với các ứng dụng đa luồng như CompletableFuture và ForkJoinPool.