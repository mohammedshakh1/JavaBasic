public class VariableDemo3{

public static void main(String[] args){

System.out.println("Hello i am learning Java from the basic");

int x = 2;
int y = 4;

int total = x + y;

System.out.println("Total: " + total);

String germX = "Sanitizer";

char sanitizerNameFirstLetter = 'G';

System.out.println("germX is " + germX);  
System.out.println("And first initial is " + sanitizerNameFirstLetter);

boolean isSanitizerGIsGoood = true;

System.out.println("Sanitizer G a good product " + isSanitizerGIsGoood);

numberOfSanitizer();


 }

 public static void numberOfSanitizer(){

    int numberOfSanitizerGermX = 20;
    int numberOfSanitizerPurple = 15;

    int totalNumberOfSanitizer = numberOfSanitizerGermX + numberOfSanitizerPurple;

    System.out.println("Total number of hand sanitizer is " + totalNumberOfSanitizer);


 }




}