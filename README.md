# Multithreading

### Multithreading trong Java là một kĩ thuật cho phép thực hiện đồng thời nhiều đoạn mã code hay nhiều luồng (thread) trong một ứng dụng nhằm tăng hiệu suất và tận dụng tối đa tài nguyên của hệ thống.
### Multithreading rất hữu ích trong các ứng dụng cần xử lý nhiều tác vụ cùng lúc, ví dụ như xử lý song song, ứng dụng web hoặc trò chơi.
### Thread là một đơn vị nhỏ nhất của một tiến trình (process), có thể chạy đồng thời với các thread khác trong cùng một tiến trình. Mỗi thread chia sẻ cùng không gian bộ nhớ của tiến trình cha, nhưng có thể thực hiện các tác vụ khác nhau.
### Sự khác biệt giữa Thread và Runable
<ul>
    <li>Extend Thread: Khi một class extend Thread thì class đó không thể kế thừa từ một class nào khác.</li>
    <li>Implements Runnable: Khi sử dụng Runnable, có thể linh hoạt hơn trong việc thiết class, vì có thể kế thừa từ các class khác.</li>
</ul>

### Các phương thức quản lý thread

<ul>
    <li>start(): Bắt đầu thread và chuyển nó vào trạng thái "runnable".</li>
    <li>run(): Định nghĩa công việc của thread (không gọi trực tiếp phương thức này để bắt đầu thread, chỉ start() mới thực sự bắt đầu thread).</li>
    <li>sleep(milliseconds): Tạm ngưng thread hiện tại trong một khoảng thời gian.</li>
    <li>join(): Chờ cho một thread kết thúc trước khi tiếp tục các công việc khác.</li>
    <li>yield(): Tạm nhường CPU cho các thread khác có cùng độ ưu tiên.</li>
    <li>setPriority(int priority): Đặt mức độ ưu tiên cho thread (1–10).</li>
    <li>isAlive(): Kiểm tra xem một thread có còn đang chạy hay không.</li>
</ul>

### ExecutorService và Thread Pool: Khi cần quản lý nhiều thread chúng ta nên sử dụng ExecutorService để tối ưu hóa việc tạo và quản lý. ExecutorService sử dụng các ThreadPool để tái sử dụng thread, giúp cải thiện hiệu suất và tài nguyên hệ thống.

### Deadlock và Livelock

<ul>
    <li>Deadlock: Xảy ra khi hai hoặc nhiều thread chờ lẫn nhau để giải phóng tài nguyên mà mỗi thread khác đang giữ, dẫn đến việc không thread nào có thể tiến hành công việc của mình.</li>
    <li>Livelock: Xảy ra khi hai thread hoặc nhiều hơn phản ứng với nhau và tiếp tục thay đổi trạng thái của mình nhưng không thực sự tiến triển. Để tránh tình trạng này, bạn có thể sử dụng các kỹ thuật đồng bộ cẩn thận hoặc sử dụng các cấu trúc khóa không chặn (non-blocking).</li>
</ul>