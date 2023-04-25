public class ScentedCandle extends Candle {
  private String scent;

  private double pricePerInch = 3;

  public ScentedCandle() {
    super();
    this.scent = "";
  }

  public ScentedCandle(String color, double height, String scent) {
    super(color, height);
    this.scent = scent;
    this.price = height * pricePerInch;
  }

  public String getScent() {
    return scent;
  }

  public void setScent(String scent) {
    this.scent = scent;
  }

  public void setHeight(double height) {
    this.height = height;
    this.price = height * pricePerInch;
  }
}
