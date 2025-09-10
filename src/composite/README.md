### Composite Design Pattern
#### Khái niệm
* Trong trường hợp có một nhóm đối tượng có quan hệ với nhau và trong một số trường hợp muốn cùng lúc xử lý những nhóm đối tượng này ? Composite sẽ giúp các bạn xử lý một nhóm đối tượng giống như cách chúng ta xử lý một object thông thường.
* Composite là một sự tổng hợp các thành phần có quan hệ với nhau để tạo ra thành phần lớn hơn. Nó cho phép tương tác với tất cả đối tượng bên trong tương tự như nhau.
* Có thể liên tưởng tới cấu trúc cây một gốc lại có nhiều node con và nột node con lại có nhưng node con bên trong hoặc các leaf (không thể có thêm nhánh bên trong). Hay cấu trúc một file của Linux hay Windows, một folder có thể có nhiều folder con hoặc file....
#### Các thành phần
* BaseComponent: là một interface hoặc abastract class quy định các method cần phải có cho tất cả các thành phần tham gia vào mẫu.
* Leaf : là lớp thực hiện kế thừa từ BaseComponent và không có con (giống như file thì không thể chứa file hoặc folder khác vây).
* Composite: lưu trữ các Leaf và cũng kế thừa từ BaseComponent. Chúng cài đặt các phương thức có trong BaseComponent và khi gọi sẽ gọi thực hiện tại các thành phần con. 
* Client: đại diện cho nơi sử dụng Composite.