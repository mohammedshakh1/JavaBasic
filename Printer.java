public class Printer{

    public static void main(String[] args){

        System.out.println("I am making a printer");
        
        int numberOfPrinter = 1;
        int numberOfColor = 2;
        int numberOfScreen = 1;

        int totalParts = numberOfColor + numberOfPrinter + numberOfScreen;
        System.out.println("Total parts = " + totalParts);

        String printerName = "Nokia";
        System.out.println("Name of the Printer is " + printerName);

        String printerName2 = "Samsung";
        System.out.println("Name of the Printer is " + printerName2);

        String printerName3 = "Apple";
        System.out.println("Name of the Printer is " + printerName3);
        


    }
}