package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    // class variables
    private int argOne = 0;
    private int argTwo = 0;

    // constructor method
    public Multiply(int argOne, int argTwo){
        this.argOne = argOne;
        this.argTwo = argTwo;
    }

    /*
     to string method cast the multiplication operation to string
     arg1 * arg2
    */
    public String toString(){
        return String.valueOf(argOne * argTwo );
    }
}
