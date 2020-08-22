package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here

    // class variables
    private int argOne = 0;
    private int argTwo = 0;

    // constructor
    public Add(int argOne, int argTwo){
        this.argOne = argOne;
        this.argTwo = argTwo;
    }

    // to string method returns and cast to string the add operation
    public String toString(){
        return String.valueOf(argOne+argTwo);
    }


}
