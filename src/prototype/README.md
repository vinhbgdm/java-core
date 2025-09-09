### Prototype Design Pattern
#### Khái niệm
* Làm thế nào để tạo ra một đối tượng gần giống hoặc giống hoàn toàn với một đối tượng bạn đã tạo trước đó ? Nếu câu trả lời là object1 = object2 thì sai hoàn toàn!
* Vậy chúng ta làm như nào trong trường hợp này ? Nếu câu trả lời là kế thừa class từ interface Cloneable và thêm nữa nếu chưa từng biết đến Prototype thì đã đang sử dụng Prototype một cách vô tình rồi ! thay vì dùng từ khóa new để và thêm đối số một cách thủ công chúng ta nên sử dụng Prototype để copy lại một đối tượng có sẵn. Như vậy chúng ta sẽ tiết kiếm được thời gian và tài nguyên khi khởi tạo một object.
#### Các thành phần của Prototype
* Prototype : khai báo một class, interface hoặc abtract class cho việc clone chính nó.
* ConcretePrototype: class sẽ kế thừa Prototype và thực thi nhân bản chính bản thân nó cụ thể tại hàm clone(). Tất nhiên việc clone không cần thiết nếu tại Prototype chúng ta đã thực hiện clone chính nó rồi (với Prototype là class).
* Client: đại diện cho nơi sử dụng hay nơi gọi clone một object.