public class CarMain {
    public static void main(String[] args) {
             Car nisan = new Car();
             nisan.make = "nisan";
             nisan.price = 5000;
             nisan.year = 2020;
             nisan.color = "red";
        System.out.println("this "+ nisan.make +" is worth "+ nisan.price +". it was built in "+ nisan.year
        +". the color of this car is "+ nisan.color +"\n");

        Car dodge = new Car();
        dodge.make = "dodge";
        dodge.price = 11000;
        dodge.year = 2019;
        dodge.color = "blue";

        System.out.println("this "+ dodge.make +" is worth "+ dodge.price +". it was built in "+ dodge.year
                +". the color of this car is "+ dodge.color +"\n");
    }
}
