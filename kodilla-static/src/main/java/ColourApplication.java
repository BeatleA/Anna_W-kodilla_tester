public class ColourApplication {
    public static void main(String[] args) {
       ColourSelector selector = new ColourSelector();
       ColourSelector.Colour colour = selector.selectColour();
       System.out.println("Colour: " + colour.toString().toLowerCase());
    }
}
