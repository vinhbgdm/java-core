package proxy;

public class RealImage implements Image {
    private String url;

    public RealImage(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        System.out.println("Load from " + this.url);
    }
}
