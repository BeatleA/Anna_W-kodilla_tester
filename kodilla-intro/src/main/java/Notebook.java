public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void printAtributes(){
        System.out.println("Weight: " + this.weight + "g Price: " + this.price + " Year: " + this.year);
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (Integer.valueOf(this.weight) < 1000) {
            System.out.println("This notebook is light.");
        } else if (Integer.valueOf(this.weight) < 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkPriceByYear() {
        if (isGoodValue()) {
            System.out.println("The price is good for the age of the notebook.");
        } else if (isCheap()) {
            System.out.println("This notebook is cheap for its age.");
        } else {
            System.out.println("The notebook is too expensive.");
        }
    }

    private Boolean isGoodValue(){
        if (price < 1000){
            return year < 2015;
        } else if (price < 2000) {
            return year >=2015;
        } else {
            return false;
        }
    }

    private Boolean isCheap(){
        return (year >= 2015 && price<1000);
    }
}
