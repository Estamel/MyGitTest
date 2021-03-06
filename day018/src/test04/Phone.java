package test04;

public class Phone {
    private String brand;
    private String color;
    private String producer;

    public Phone() {
    }

    public Phone(String brand, String color, String producer) {
        this.brand = brand;
        this.color = color;
        this.producer = producer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
