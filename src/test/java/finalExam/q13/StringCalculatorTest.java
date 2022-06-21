package finalExam.q13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class StringCalculatorTest 
{
    @Test
    public void TestAdd1() {
        int test = StringCalculator.add("1,2,3");
        assertEquals(6, test);
    }
    
    @Test
    public void testAdd2() {
    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		StringCalculator.add("-1, 2");
    	});
    }
    
    @Test
    public void testAdd3() {
    	int test = StringCalculator.add("1, 1000");
    	assertEquals(1, test);
    }

}
