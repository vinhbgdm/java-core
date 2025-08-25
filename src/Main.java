import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws Exception {
        // Lấy đối tượng Class
        Class<?> clazz = User.class;

        // Tạo đối tượng của lớp đó
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Lấy phương thức và gọi nó
        Method method = clazz.getDeclaredMethod("printMessage");
        method.setAccessible(true);
        method.invoke(obj);

        // Truy cập và thay đổi giá trị của trường dữ liệu private
        Field fieldName = clazz.getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(obj, "Vinh BG");
        System.out.println(fieldName.get(obj));

        System.out.println(obj);

        if (method.isAnnotationPresent(SampleAnnotation.class)) {
            SampleAnnotation annotation = method.getAnnotation(SampleAnnotation.class);
            System.out.println(annotation.value());
        }

        System.out.println("=========================");
        checkRoleUser(12);
    }

    private static void checkRoleUser(Integer userId) {
        UserService userService = new UserServiceImpl();
        UserInvocationHandler userInvocationHandler = new UserInvocationHandler(userService);
        UserService proxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), userInvocationHandler);
        if(userId == null){
            userId = 0;
            proxy.getUser(userId);
        } else {
            System.out.println(proxy.getUser(userId));
        }
    }
}