package HomeWork9;

public abstract class Shape {
    private String name;
    private String texture;

    public abstract void prinPerimeter();

    public abstract void printPloshad();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}
