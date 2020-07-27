public class VariableDemo{

    public static void main(String[] args){
    
    System.out.println("Hello Learning Data Types in Java");
    
    //How many phone do you have?
    
    int numberOfPhone = 2;
    
    int numberOfLaptop = 2;
    
    // Value of total gadget = 4
    int totalGadgets = numberOfPhone + numberOfLaptop;
    // Please print in the console whatever inside the double quotation " "
    System.out.println("Total Gadget of Asif " + totalGadgets);
    
    // Name of the last boy in the class
    
    String nameOfLastBoy = "John";
    
    char johnsGrade = 'F';

    System.out.println("Name of the last boy and Grade is " + nameOfLastBoy + johnsGrade);
    
    // Is John is a bad boy? true/false
    
    boolean isJohnIsGoodBoy = false;
    
    System.out.println("Is John a Good Boy " + isJohnIsGoodBoy);
    
    byte numberOfBytes = 125;
    System.out.println("Number Of Bytes " + numberOfBytes);
    
    double valueOfPie = 3.141592653589793238;
    System.out.println("Value of Pie " + valueOfPie);
    
    // Bring add() method inside the main method
    add();
    
        }
    
    public static void add(){
        int x = 4;
        int y = 5;
    
        int total = x + y;
        System.out.println("Total : " + total);
    }
    
    }