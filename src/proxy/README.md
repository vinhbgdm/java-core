### Proxy Design Pattern
#### Khái niệm
* Tưởng tượng như là một lớp bọc ngoài bảo vệ cho nội dung bên trong muốn truy cập tới nội dung cần phải thông qua proxy.
* Proxy chính là lớp trung gian lớp đại diện và khi muốn truy cập tới một đối tượng cần phải thông qua Proxy này. Proxy sẽ đại diện cho đối tượng thực thi những phương thức, tại đó chúng ta có thể định nghĩa lại cách thực hiện phương thức sao cho phù hợp.
#### Các thành phần
* Subject : là một interface định nghĩa các phương thực để giao tiếp với client xác định những phương thức chung cho RealSubject và Proxy để Proxy có thể được sử dụng bất cứ nơi nào mà RealSubject muốn.
* Proxy : là một class sẽ thực hiện các bước kiểm tra và gọi tới đối tượng của class RealSubject để thực hiện các thao tác sau khi kiểm tra. Nó duy trì một tham chiếu đến RealSubject để Proxy có thể truy cập nó. Nó cũng thực hiện các giao diện tương tự như RealSubject để Proxy có thể được sử dụng thay cho RealSubject. Proxy cũng điều khiển truy cập vào RealSubject và có thể tạo hoặc xóa đối tượng này.
* RealSubject : là một class service sẽ thực hiện các thao tác thực sự. Đây là đối tượng chính mà proxy đại diện.
* Client : đại diện cho nơi cần sử dụng RealSubject nhưng cần thông qua Proxy.