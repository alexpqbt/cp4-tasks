public class DemoCandles {
  public static void main(String[] args) {
    Candle c1 = new Candle("red", 8);
    ScentedCandle sc1 = new ScentedCandle("blue", 9, "smelly");

    displayInfo(c1);
    displayInfo(sc1);
  }

  public static void displayInfo(Candle candle) {
    System.out.println("Color: " + candle.getColor());
    System.out.println("Height: " + candle.getHeight() + " inches");
    System.out.println("Price: PHP " + candle.getPrice());

    if (candle instanceof ScentedCandle) {
      ScentedCandle scentedCandle = (ScentedCandle) candle;
      System.out.println("Scent: " + scentedCandle.getScent());
    }
  }
}
