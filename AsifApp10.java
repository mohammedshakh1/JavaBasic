public class AsifApp10{

    public static void main(String[] args){

        double salesTax = 8.123451234567199;
        double stateTax = 12.393393939393999;
        double federalTax = 1.122121212121212;

        double totalTax = salesTax * stateTax * federalTax;

        System.out.println("Total tax = " +totalTax);

        int totalCash = 99000;
        int carPrice = 72657;
        int motorcyclePrice = 12450;

        int carAndMotorcyclePrice = carPrice + motorcyclePrice;
        System.out.println("Total Car and Motorcyle price = " + carAndMotorcyclePrice);

        int howMuchCashLeft = carAndMotorcyclePrice - totalCash;
        System.out.println("Cash Left = " + howMuchCashLeft);









    }







}