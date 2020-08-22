package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    // class variables
    private int argOne = 0;
    private int argTwo = 0;

    // constructor method
    public Subtract(int argOne, int argTwo){
        this.argOne = argOne;
        this.argTwo = argTwo;
    }

    /*
     to string method cast the subtraction operation to string
     if the first argument is greater or equal to the second (arg1 = minuend, arg2 = subtrahend)
     but if the second argument is greater than the first (arg2 = minuend, arg1= subtrahend)
    */
    public String toString(){
        return String.valueOf(argOne>=argTwo ? argOne - argTwo: argTwo - argOne);
    }
}
