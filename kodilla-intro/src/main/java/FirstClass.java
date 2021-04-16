public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600", 1000, 2018);
        notebook.printAtributes();
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceByYear();
        System.out.println();

        Notebook heavyNotebook = new Notebook("2000", 1500, 2020);
        heavyNotebook.printAtributes();
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceByYear();
        System.out.println();

        Notebook oldNotebook = new Notebook("1200", 500, 2012);
        oldNotebook.printAtributes();
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceByYear();
        System.out.println();

        Notebook expensiveNotebook = new Notebook("1300", 2000, 2016);
        expensiveNotebook.printAtributes();
        expensiveNotebook.checkPrice();
        expensiveNotebook.checkWeight();
        expensiveNotebook.checkPriceByYear();
        System.out.println();

        Notebook cheapNotebook = new Notebook("700", 900, 2017);
        cheapNotebook.printAtributes();
        cheapNotebook.checkPrice();
        cheapNotebook.checkWeight();
        cheapNotebook.checkPriceByYear();
    }
}
