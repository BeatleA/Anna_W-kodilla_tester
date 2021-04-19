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
        Colour chosenColour;
        switch (userSelected) {
            case "R":
                chosenColour = Colour.RED;
                break;
            case "G":
                chosenColour = Colour.GREEN;
                break;
            case "B":
                chosenColour = Colour.BLUE;
                break;
            case "Y":
                chosenColour = Colour.YELLOW;
                break;
            case "O":
                chosenColour = Colour.ORANGE;
                break;
            case "P":
                chosenColour = Colour.PINK;
                break;
            case "W":
                chosenColour = Colour.WHITE;
                break;
            default: chosenColour = Colour.BLACK;
        }
        return chosenColour;
    }
}
