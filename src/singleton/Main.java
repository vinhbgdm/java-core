package singleton;

public class Main {
    public static void main(String[] args) {
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("Vinh");
        System.out.println(eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName());
    }
}
