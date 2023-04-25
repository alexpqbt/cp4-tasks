public class ScentedCandle extends Candle{
  private String scent;

  public ScentedCandle() {
    super();
    this.scent = "";
  }

  public ScentedCandle(String color, double height, String scent) {
    super(color, height);
    this.price = height * 3;
    this.scent = scent;
  }

  public String getScent() {
    return scent;
  }

  public void setScent(String scent) {
    this.scent = scent;
  }

  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    this.price = height * 3;
  }
}
