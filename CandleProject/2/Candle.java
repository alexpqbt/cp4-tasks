public class Candle {
  private String color;
  private double height;
  protected double price;

  public Candle() {
    this.color = "";
    this.height = 0;
    this.price = 0;
  }

  public Candle(String color, double height) {
    this.color = color;
    this.height = height;
    this.price = height * 2;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
    this.price = height * 2;
  }

  public double getPrice() {
    return price;
  }
}