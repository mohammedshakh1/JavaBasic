public class VariableDemo5{

    public static void main(String[] args){
        System.out.println("Learning java demo number 5 ");

        String soap1Name = "Johnson Johnson's";
        String soap2Name = "Dove";
        String soap3Name = "Irish";
        
        System.out.println("Name of the Soap 1 is " + soap1Name);
        System.out.println("Name of the Soap 2 is " + soap2Name);
        System.out.println("Name of the Soap 3 is " + soap3Name);


        int johnsonsSoap = 8;
        int doveSoap = 3;
        int irishSoap = 24;

        int totalNumberOfSoap = johnsonsSoap + doveSoap + irishSoap;
        System.out.println("Total number of soap is " + totalNumberOfSoap);

        char johnsonsSoapRating = 'A';
        char doveSoapRating = 'B';
        char irishSoapRating = 'C';

        System.out.println("Rating of all the soap's are " + johnsonsSoapRating + doveSoapRating + irishSoapRating);


    soapValueAndQuality();





    }
    public static void soapValueAndQuality(){

        byte numberOfBytes = 111;
        System.out.println("Number of bytes is " + numberOfBytes);

        float valueOfJohnsonSoap = 3.123456f;

        double valueOfDoveSoap = 0.12345678912131415;

        boolean isIrishAGoodSoap = false;

        System.out.println("Value of Johnson Soap is " + valueOfJohnsonSoap);
        System.out.println("Value of Dove Soap is " + valueOfDoveSoap);
        System.out.println("Irsh is a good soap " + isIrishAGoodSoap);



    }





}