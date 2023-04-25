public class Candle {
  private String color;
  protected double height;
  protected double price;

  private double pricePerInch = 2;

  public Candle() {
    this.color = "";
    this.height = 0;
    this.price = 0;
  }

  public Candle(String color, double height) {
    this.color = color;
    this.height = height;
    this.price = height * pricePerInch;
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

  public void setHeight(double height) {
    this.height = height;
    this.price = height * pricePerInch;
  }

  public double getPrice() {
    return price;
  }
}