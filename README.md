# Exception Handling
## Unchecked Exceptions (Runtime Exceptions) – không bắt buộc xử lý

### NullPointerException: Gọi method hoặc thuộc tính trên biến null.
### ArrayIndexOutOfBoundsException: Truy cập phần tử ngoài giới hạn mảng.
### ArithmeticException: Lỗi toán học như chia cho 0.
### ClassCastException: Ép kiểu sai giữa các object không tương thích.
### IllegalArgumentException: Đối số truyền vào method không hợp lệ.
### IllegalStateException: Trạng thái object không hợp lệ để gọi một hành động.
### NumberFormatException: Chuyển chuỗi không hợp lệ sang số.

## Checked Exceptions – bắt buộc phải try-catch hoặc throws

### IOException: Lỗi khi đọc/ghi file, thao tác I/O.
### FileNotFoundException: Mở file không tồn tại.
### SQLException: Lỗi khi truy vấn cơ sở dữ liệu (JDBC).
### InterruptedException: Khi luồng đang ngủ hoặc chờ thì bị ngắt.