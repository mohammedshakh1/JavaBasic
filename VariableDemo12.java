public class VariableDemo12{

    public static void main(String[] args){

        System.out.println("Practicing java Variables");

        short totalCash = 32000;
        short newCar = 20000;
        short usedCar = 11000;

        int totalPriceOfCars = newCar + usedCar;
        System.out.println("Total Price = " + totalPriceOfCars);



        int cashLeftAfterPurchese = totalCash - totalPriceOfCars;
        System.out.println("Cash left after purchese = " + cashLeftAfterPurchese);




    }




}