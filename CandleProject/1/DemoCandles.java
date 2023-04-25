public class DemoCandles {
  public static void main(String[] args) {
    Candle c1 = new Candle();
    ScentedCandle c2 = new ScentedCandle();

    c1.setColor("red");
    c1.setHeight(8);

    c2.setColor("blue");
    c2.setHeight(9);
    c2.setScent("smelly");

    displayInfo(c1);
    System.out.println();
    displayInfo(c2);
  }

  public static void displayInfo(Candle candle) {
    System.out.println("Color: " + candle.getColor());
    System.out.println("Height: " + candle.getHeight() + " inches");
    System.out.println("Price: " + "PHP " + candle.getPrice());

    if (candle instanceof ScentedCandle) {
      ScentedCandle sCandle = (ScentedCandle) candle;
      System.out.println("Scent: " + sCandle.getScent());
    }
  }
}
