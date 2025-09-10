package facade;

public class Chair implements Furniture {
    @Override
    public void make() {
        System.out.println("Make a chair");
    }
}
