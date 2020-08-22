package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {

    // variables of the operations in order to use them in processing
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        // if the operation is equals to 1 select add operation
        if(operation == 1){
            Add a1 = new Add(argumentOne, argumentTwo);
            mOut.print(a1.toString());
        }

        // if the operation is equals to 2 select subtract operation
        else if(operation == 2){
            Subtract s1 = new Subtract(argumentOne, argumentTwo);
            mOut.print(s1.toString());
        }

        // if the operation is equals to 3 select multiplication operation
        else if(operation == 3){
            Multiply m1 = new Multiply(argumentOne, argumentTwo);
            mOut.print(m1.toString());
        }

        // if is not one of the former select division operation
        else{
            Divide d1 = new Divide(argumentOne, argumentTwo);
            mOut.print(d1.toString());
        }
    }
}
