### 1. Các loại Exception trong Java:
#### a) Unchecked Exceptions (Runtime Exceptions) – không bắt buộc xử lý: đây là những ngoại lệ xảy ra khi có lỗi lập trình và không bị trình biên dịch kiểm tra. Thường là các lỗi logic trong chương trình.

> NullPointerException: Gọi method hoặc thuộc tính trên biến null.
> 
> ArrayIndexOutOfBoundsException: Truy cập phần tử ngoài giới hạn mảng.
> 
> ArithmeticException: Lỗi toán học như chia cho 0.
>
> ClassCastException: Ép kiểu sai giữa các object không tương thích.
>
> IllegalArgumentException: Đối số truyền vào method không hợp lệ.
>
> IllegalStateException: Trạng thái object không hợp lệ để gọi một hành động.
>
> NumberFormatException: Chuyển chuỗi không hợp lệ sang số.

#### b) Checked Exceptions – bắt buộc phải try-catch hoặc throws: đây là những ngoại lệ mà trình biên dịch bắt buộc phải xử lý (thường là ngoại lệ có thể xảy ra trong quá trình đọc file, kết nối, cơ sở dữ liệu,...)

> IOException: Lỗi khi đọc/ghi file, thao tác I/O.
> 
> FileNotFoundException: Mở file không tồn tại.
> 
> SQLException: Lỗi khi truy vấn cơ sở dữ liệu (JDBC).
> 
> InterruptedException: Khi luồng đang ngủ hoặc chờ thì bị ngắt.

### 2. Các từ khóa chính:
> try: được sử dụng để bao bọc đoạn mã có thể phát sinh ngoại lệ.
> 
> catch: dùng để xử lý các ngoại lệ phát sinh trong khối try, khi ngoại lệ xảy ra, Java sẽ tìm khối catch tương ứng để xử lý.
> 
> finally: khối lệnh này luôn được thực thi dù có ngoại lệ có xảy ra hay không, nó thường được dùng để dọn dẹp tài nguyên như đóng tệp hoặc kết nối cơ sở dữ liệu.
> 
> throw: được dùng để ném ra một ngoại lệ một cách rõ ràng trong chương trình.
> 
> throws: khai báo ngoại lệ có thể phát sinh trong phương thức, để phương thức gọi biết rằng ngoại lệ có thể xảy ra và phải được xử lý.
### 3. Cú pháp Exception Handling
### 4. Lợi ích của Exception Handling
> Exception Handling giúp chương trình Java có thể xử lý các lỗi tiềm tàng mà không làm gián đoạn hoạt động của ứng dụng và giúp lập trình viên dễ dàng kiểm soát luồng xử lý của chương trình khi các lỗi phát sinh.
* Bảo vệ chương trình khỏi bị dừng đột ngột: Khi một ngoại lệ xảy ra, chương trình không bị dừng ngay lập tức mà thay vào đó nó tìm kiếm cách xử lý ngoại lệ.
* Tách biệt logic bình thường và xử lý lỗi: Chương trình dễ đọc hơn và có cấu trúc rõ ràng hơn.
* Giảm thiểu rủi ro của lỗi: Bằng cách xử lý các trường hợp ngoại lệ có thể xảy ra.
### 6. Lưu ý trong xử lý Exception Handling
* Không xử lý ngoại lệ chung chung: Tránh sử dụng catch(Exception e) mà không kiểm tra loại ngoại lệ cụ thể.
* Đừng bỏ qua khối catch: Đảm bảo rằng bạn thực sự xử lý hoặc ghi lại thông tin về ngoại lệ thay vì để nó trống.
* Dùng finally để giải phóng tài nguyên: Nếu tài nguyên cần được đóng lại (như kết nối cơ sở dữ liệu hoặc file), hãy sử dụng finally.
* Tạo custom exceptions: Để xử lý những trường hợp đặc biệt, bạn có thể tạo các lớp ngoại lệ riêng của mình bằng cách kế thừa từ Exception hoặc RuntimeException.
### 7. Exception là gì? Phân biệt Checked và Unchecked Exception?
* Exception là một tình huống bất thường xảy ra trong quá trình thực thi chương trình, làm gián đoạn luồng chương trình.
* Checked Exception là những ngoại lệ bắt buộc phải được xử lý tại compile-time, như IOException, SQLException. Trình biên dịch yêu cầu chúng ta phải xử lý chúng bằng cách sử dụng try-catch hoặc throws.
* Unchecked Exception là những ngoại lệ xảy ra trong runtime, như NullPointerException, ArrayIndexOutOfBoundsException. Chúng không bắt buộc phải được xử lý tại compile-time.
### 8. Sự khác nhau giữa throw và throws là gì?
* throw được dùng để ném một ngoại lệ cụ thể trong một khối mã. Ví dụ:
> throw new ArithmeticException("Lỗi chia cho 0");
* throws được sử dụng trong khai báo phương thức để chỉ ra rằng phương thức có thể ném một hoặc nhiều ngoại lệ. Ví dụ:
> public void doSomething() throws IOException
### 9. Lợi ích của việc sử dụng khối finally là gì?
* Khối finally luôn được thực thi cho dù có ngoại lệ xảy ra hay không. Nó được sử dụng để dọn dẹp tài nguyên như đóng tệp, ngắt kết nối cơ sở dữ liệu, hoặc giải phóng bộ nhớ.
