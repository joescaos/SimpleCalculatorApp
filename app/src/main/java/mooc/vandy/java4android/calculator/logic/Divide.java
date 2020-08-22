package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    // class variables
    private int argOne = 0;
    private int argTwo = 0;

    // constructor method
    public Divide(int argOne, int argTwo){
        this.argOne = argOne;
        this.argTwo = argTwo;
    }

    /*
     to string method cast the division operation to string

    */
    public String toString(){
        return String.valueOf(argOne/argTwo) + " R: " + String.valueOf(argOne%argTwo);
    }
}
