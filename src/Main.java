import entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        int ketqua = tong(0, 1);
//        System.out.println(ketqua);


//        String[] names = new String[3];
//        names[0] = "An";
//        System.out.println(names[1].length());

//        List<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add(null);
//        System.out.println(list.get(1).toLowerCase());

//        Map<String, String> map = new HashMap<>();
//        map.put("name", null);
//        System.out.println(map.get("name").length());

//        List<Student> list = List.of(new Student(1, "An"), new Student(2, "Bin"));
//        try {
//            Student s = findById(3, list);  // ID không tồn tại
//            System.out.println(s.getName());
//        } catch (NotFoundException e) {
//            System.err.println(e.getMessage());
//        }

    }

    static int tong(int a, int b){
        if(a == 0 || b == 0){
            throw new InvalidParamException("Khong cho phep gia tri 0");
        }
        return a + b;
    }

    static Student findById(int id, List<Student> students) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        // Không tìm thấy => ném NotFoundException
        throw new NotFoundException("Khong tim thay sinh vien voi ID: " + id);
    }
}