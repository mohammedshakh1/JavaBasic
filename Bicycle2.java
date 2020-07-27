public class Bicycle2 {

    boolean isMoving = true;
    int currentSpeed = 6;

    
    public void applyBrakes() {

       
        if (isMoving){

            currentSpeed--;
            System.out.println("Speed will decrese after brake currentSpeed " + currentSpeed);
        }
    }
    public void applyBrakesAgain(){

        isMoving = false;

        if(isMoving){
        
            currentSpeed--;
        }
        else {

            System.out.println("The bicycle has already stopped!");

        }

    }

    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.applyBrakes();
        myBicycle.applyBrakesAgain();
    }

}