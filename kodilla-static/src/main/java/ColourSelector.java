public class ColourSelector {
    enum Colour {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE,
        PINK,
        WHITE,
        BLACK
    }

    public Colour selectColour() {
        String userSelected = UserDialogs.getColour();
        switch (userSelected) {
            case "R":
                return Colour.RED;
            case "G":
                return Colour.GREEN;
            case "B":
                return Colour.BLUE;
            case "Y":
                return Colour.YELLOW;
            case "O":
                return Colour.ORANGE;
            case "P":
                return Colour.PINK;
            case "W":
                return Colour.WHITE;
            default: return Colour.BLACK;
        }
    }
}
