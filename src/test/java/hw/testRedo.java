package hw;
 
import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testRedo{
    
    
    @Test
    public void testFizzBuzz(){
        Assertequals("Fizz", fizzBuzz(3));
        Assertequals("Buzz", fizzBuzz(5));
        Assertequals("FizzBuzz", fizzBuzz(15));
    }
}