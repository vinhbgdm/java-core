package facade;

public class Television implements Furniture {
    @Override
    public void make() {
        System.out.println("Make a tv");
    }
}
