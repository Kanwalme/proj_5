import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    Balanced balancedBrack = new Balanced();
    String balancedPar = "(Kanwal)";
    String unbalancedBrackets = "{hello";
    String balancedBracketsandPar = "{(Kanwal)}";


    @Test
    public void testBalancedBracketsTest_balancedPar(){
        assertTrue(balancedBrack.balancedParentheses("(Sana)"));
    }
    @Test
    public void testBalancedBracketsTest_unbalancedBrackets(){
        assertFalse(balancedBrack.balancedBrackets("{(hello}"));
    }
    @Test
    public void testBalancedBracketsTest_balancedBracketsandPar(){
        assertTrue(balancedBrack.balancedBrackets("{(Kanwal)}"));
    }
}
