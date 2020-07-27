public class VariableDemo2{

    public static void main(String[] args){
    
    System.out.println("Hello Learning Data Types in Java Trying again");
    
    //How many phone do you have?
    
    int numberOfPhone = 30;
    
    int numberOfLaptop = 20;
    
    // Value of total gadget = 50
    int totalGadgets = numberOfPhone + numberOfLaptop;
    // Please print in the console whatever inside the double quotation " "
    System.out.println("Total Gadget of Fahmida " + totalGadgets);
    
    // Name of the last boy in the class
    
    String nameOfFirstGirl = "Fahmida";
    
    char fahmidaGrade = 'A';
    
    // Is Fahmida is a good girl? true/false
    
    boolean isFahmidaGoodGirl = true;
    
    System.out.println("Is Fahmida a Good girl " + isFahmidaGoodGirl);
    
    byte numberOfBytes = 100;
    System.out.println("Number Of Bytes " + numberOfBytes);
    
    double valueOfPie = 3.141592653589793238;
    System.out.println("Value of Pie " + valueOfPie);
    
    // Bring add() method inside the main method
    addApp1();
    
        }
    
    public static void addApp1(){
        int x = 15;
        int y = 5;
    
        int total = x + y;
        System.out.println("Total : " + total);
    }
    
    }